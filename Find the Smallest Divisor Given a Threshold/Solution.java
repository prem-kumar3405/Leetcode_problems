class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int left = 1;
        int right = nums[0];
        for(int n: nums)
        {
           
            right = Math.max(right ,n);
        }
        int ans = 1;
        while(left <= right)
        {
            int mid = left +(right - left)/2;

            if(isPossible(nums,threshold,mid))
            {
                ans = mid;
                right = mid-1;
            }
            else
         