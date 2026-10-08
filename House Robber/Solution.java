class Solution {
    public int rob(int[] nums) {
        return backtrack(nums,0);
    }
    public int backtrack(int [] nums,int start)
    {
       if(start>=nums.length) return 0;
       int pick = nums[start]+backtrack(nums,start+2);
       int nonpick = backtrack(nums,start+1);
       return Math.max(pick,nonpick);
    }
}