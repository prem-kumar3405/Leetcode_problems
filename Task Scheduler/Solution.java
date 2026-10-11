e(b[1], a[1]));

        for (int key : map.keySet()) {
            pq.offer(new int[]{key, map.get(key)});
        }

        Queue<int[]> wait = new LinkedList<>();
        int time = 0;

        while (!pq.isEmpty() || !wait.isEmpty()) {
            time++;

            if (!pq.isEmpty()) {
                int[] curr = pq.poll();
                curr[1]--;

                if (curr[1] > 0) {
                    wait.offer(new int[]{curr[0], curr[1], time + n});
                }
            }

            if (!wait.isEmpty() && wait.peek()[2] == time) {
                int[] curr = wait.poll();
                pq.offer(new int[]{curr[0], curr[1]});
            }
        }

        return time;
    }
}
