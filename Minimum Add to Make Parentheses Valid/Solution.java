class Solution {
    public int minAddToMakeValid(String s) 
    {
        Stack<Character> str= new Stack<>();
       for(char ch:s.toCharArray())
       {
        if(str.isEmpty())
        {
            str.push(ch);
        }
        else if(str.peek()=='(' && ch==')')
        {
            str.pop();
        }
        else
        {
            str.push(ch);
        }
 
       }
       return str.size();
    }
}