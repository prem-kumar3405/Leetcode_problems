class Solution {
    int max;
    int arr[];
    public int deleteAndEarn(int[] nums) {
         max= nums[0];

        for(int n :nums)
        {
            max=Math.max(n,max);
        }
        arr = new int[max+1];
        int [] dp = new int[max+1];
        
        for(int n:nums)
        {
            arr[n]+=n;;
        }

        dp[0]=arr[0];
        dp[1]=arr[1];
        for(int i=2;i<max+1;i++)
        {
            dp[i]=Math.max(dp[i-1],arr[i]+dp[i-2]);
        }
        return dp[max];
        
        
    }
    

}