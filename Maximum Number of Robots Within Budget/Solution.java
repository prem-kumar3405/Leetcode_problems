chargeTimes, int[] runningCosts, long budget) {
        
        long sum = 0;
        int n = chargeTimes.length;

        Deque<Integer> deque = new ArrayDeque<>();
        int ans = 0;
        
        int left = 0;

        for(int right = 0; right < n ; right++)
        {
           sum += runningCosts[right];

           while(!deque.isEmpty() && chargeTimes[deque.peekLast()] <= chargeTimes[right])
           {
             deque.pollLast();
           }
           deque.offerLast(right);

           while(!deque.isEmpty() && (long)chargeTimes[deque.peekFirst()] + (long)(right-left+1) * sum > budget)
           {
              if(deque.peekFirst()==left)
              {
                deque.pollFirst();
                
              }
              sum-=runningCosts[left++];
           }
           ans=Math.max(ans,right-left+1);

        }
        return ans;

        
    }

}