class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count=0;

        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        for(int k:map.keySet())
        {
            if(map.get(k).size()==3)
            {
                List<Integer> list = map.get(k);

                int a = list.get(0);
                int b = list.get(1);
                int c = list.get(2);

                if(b-a == c-b)
                {
                    count++;
                }
    
            }
        }
        return count;
    }
}