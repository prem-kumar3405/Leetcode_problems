et<Long> set=new HashSet<>();

        set.add(1L);
        pq.add(1L);
        

        long current=1;
        int prime[]={2,3,5};

        for(int i=1;i<=n;i++)
        {
            current=pq.poll();

            for(int p:prime)
            {
                long next=p*current;
                if(!set.contains(next))
                {
                    set.add(next);
                    pq.add(next);
                }
            }
            
        }
        return (int) current;

     
    }
}