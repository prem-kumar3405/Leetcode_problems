class Solution {
    public int climbStairs(int n) {
       int prev1=0;
       int prev2=1;
       int ans=0;
       for(int i=0;i<n;i++)
       {
          ans=prev1+prev2;
          prev1=prev2;
          prev2=ans;
       } 
       return ans;
    }
}