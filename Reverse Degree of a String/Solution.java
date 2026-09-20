class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int a=26;
        for(char i='a';i<='z';i++)
            {
                map.put(i,a--);
            }
        int sum=0;
        for(int i=0;i<s.length();i++)
            {
                int product=(i+1)*map.get(s.charAt(i));
                sum+=product;
            }
        return sum;
    }
}