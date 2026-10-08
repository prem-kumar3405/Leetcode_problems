class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
       return Math.max(maxRob(nums,0,n-1),maxRob(nums,1,n)); 
    }
    public int maxRob(int []nums,int start ,int end)
    {
      int prev1=0;
      int prev2=0;
      for(int i = end-1;i>=start;i--)
      {
        int pick = nums[i]+prev2;
        int current = Math.max(prev1,pick);
        prev2=prev1;
        prev1 = current;
      }
      return prev1;
    }
}