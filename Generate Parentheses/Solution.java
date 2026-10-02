class Solution 
{
    List<String> ans;
    StringBuilder str;
    public List<String> generateParenthesis(int n) {
      ans = new ArrayList<>();
      str = new StringBuilder();
      backtrack(n,n);
      return ans;
      
    }
    public void backtrack(int open,int close)
    {
        if(open<0 || close<0 || open>close)
        {
            return;
        }
        if(open==0 && close==0)
        {
           ans.add(new String(str.toString()));
           return;
        }

        str.append("(");
        backtrack(open-1,close);
        str.deleteCharAt(str.length()-1);
        str.append(")");
        backtrack(open,close-1);