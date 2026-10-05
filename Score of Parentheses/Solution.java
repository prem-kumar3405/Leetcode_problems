class Solution {
    public int scoreOfParentheses(String s) {
    Stack<Integer> str = new Stack<>();
    str.push(0);
    int count=0;
    for(char ch:s.toCharArray())
    {
        if(ch=='(')
        {
              str.push(0);
        }
        else {
            int inner=str.pop();
            int outer=str.pop();
            int current=(inner==0)? 1:2*inner;
            str.push(outer+current);
        }
    }
    return str.pop();

    }
}