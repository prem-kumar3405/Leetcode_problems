class Solution {
    Integer dp [];
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        dp = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++) {
            max = Math.max(max, solve(nums, i));
        }

        return max;
    }

    public int solve(int[] nums, int i) {
        if(i == 0) return nums[0];
        if(dp[i]!=null) return dp[i];
        return dp[i]=Math.max(nums[i], nums[i] + solve(nums, i - 1));
    }
}