class Solution {
    public boolean backspaceCompare(String s, String t) {
        return solve(s).equals(solve(t));
    }
    public String solve(String s)
    {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(!st.isEmpty() && s.charAt(i)=='#')
            {
                st.pop();
            }
          if(s.charAt(i)!='#'){
                st.push(s.charAt(i));
            }
        
        }
        StringBuilder str=new StringBuilder();
        while(!st.isEmpty())
        {
            str.append(st.pop());
        }
        
        return str.toString();
    }
}