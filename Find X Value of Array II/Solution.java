class Solution {
    static class Node {
        int prod;
        int[] freq;
        Node(int k) {
            prod = 1;
            freq = new int[k];
        }
    }
    
    int k;
    Node[] tree;
    int[] nums;
    
    Node merge(Node L, Node R) {
        Node res = new Node(k);
        res.prod = (int)((1L * L.prod * R.prod) % k);
        System.arraycopy(L.freq, 0, res.freq, 0, k);
        for (int r = 0; r < k; r++) {
            if (R.freq[r] != 0) {
                int nr = (int)((