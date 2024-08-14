class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Character>st=new Stack<>();
        if(n==k)return "0";
        st.push(num.charAt(0));
        for(int i=1;i<n;i++)
        {
            char ch=num.charAt(i);
            while(!st.isEmpty() && ch<st.peek() && k!=0)
            {
                     st.pop();
                     k--;
            }
            st.push(ch);
        }
        
        Stack<Character>st1=new Stack<>();
         while(!st.isEmpty())
            {
                while(k!=0){
                     st.pop();
                     k--;
                }
                st1.push(st.pop());
            }
            while(st1.size()!=1 && st1.peek()=='0'){
                st1.pop();
            }
            StringBuilder str = new StringBuilder();
            while(!st1.isEmpty())
            {
                str.append(st1.pop());
            } 
        
         return  str.toString();
    }
}