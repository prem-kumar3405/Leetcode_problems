
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int diff = Integer.compare(Math.abs(b - x), Math.abs(a - x));
            if (diff != 0) return diff;
            return Integer.compare(b, a);
        });

        for (int num : arr) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> result = n