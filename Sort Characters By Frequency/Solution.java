t(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(b[1],a[1]));

        for(char ch:map.keySet())
        {
            pq.offer(new int[]{(int)ch,map.get(ch)});
        }
        StringBuilder str = new StringBuilder();
        while(!pq.isEmpty())
        {
            int arr[] = pq.poll();
            for(int i=0;i<arr[1];i++)
            {
                str.append((char)arr[0]);
            }
        }
        return str.toString();
    }
}