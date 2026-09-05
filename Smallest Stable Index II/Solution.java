class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int arr[] = new int[n];
        int arr2[] = new int[n];
         int max=nums[0];
        int min = nums[n-1];
        for(int i=0;i<nums.length;i++)
            {
                max=Math.max(nums[i],max);
                min=Math.min(nums[n-i-1],min);

                arr[i]=max;
                arr2[n-i-1]=min;
            }

        for(int i=0;i<n;i++)
            {
                if(arr[i]-arr2[i]<=k)
                {
                    return i;
                }
            }
        return -1;
    }
}