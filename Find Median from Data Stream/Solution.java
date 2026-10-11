) {
       if(left.size()<=right.size())
       {
         left.offer(num);
       } 
       else
       {
        right.offer(num);
       }

       while(left.size()>0 && right.size()>0 && left.peek()>right.peek())
       {
          int leftnum=left.poll();
          int rightnum=right.poll();
          
          left.offer(rightnum);
          right.offer(leftnum);
       }
    }
    
    public double findMedian() {
        // System.out.println(left);
        // System.out.println(right);
        if((left.size()+right.size())%2==0)
        {
            return (double) (left.peek()+right.peek())/2;
        }
        return (double)(left.peek());
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */