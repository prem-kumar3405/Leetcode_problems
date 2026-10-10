class Solution {
    public int kthSmallest(int[][] mat, int k) {
        List<Integer> sums = new ArrayList<>();

        for (int num : mat[0]) {
            sums.add(num);
        }

        for (int i = 1; i < mat.length; i++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (int sum : sums) {
                for (int num : mat[i]) {
                    pq.offer(sum + num);
                }
            }

            sums = new ArrayList<>();

            while (!pq.isEmpty() && sums.size() < k) {
                sums.add(pq.poll());
            }
        }

        return sums.get(k - 1);
    }
}
