class Solution {
    public int evalRPN(String[] t) {
       
          Stack<Integer>st=new Stack<>();
        int n=t.length;
        for(int i=0;i<n;i++)
        {
            int ans=0;
         
            if (isNumeric(t[i])) {
            st.push(Integer.parseInt(t[i]));
            }
            else
            {
                int n1=st.pop();
                int n2=st.pop();
                switch(t[i])
                {
                    case "*":
                        ans=n1*n2;
                        st.push(ans);
                        break;
                    case "/":
                        ans=n2/n1;
                        st.push(ans);
                        break;
                    case "+":
                        ans=n1+n2;
                        st.push(ans);
                        break;
                    case "-":
                        ans=n2-n1;
                        st.push(ans);
                        break;
                    
                }
            }
        }
        return st.peek();
    }
    private boolean isNumeric(String str) {
    try {
        Integer.parseInt(str);
        return true;
    } catch (NumberFormatException e) 
    {
        return false;
    }
}
}