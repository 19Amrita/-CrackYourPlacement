class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character>st=new Stack<>();
        Stack<Integer>freq=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
          
            char ch=s.charAt(i);

                 
                 if(!st.isEmpty() && st.peek()==ch){
                    freq.push(freq.peek()+1);
                 }
                 else{
                    freq.push(1);
                 }
                 st.push(ch);
                 if(freq.peek()==k){
                   for(int a=0;a<k;a++)
                    {
                    st.pop();
                    freq.pop();
                   
                    }  
                   
                    }
                 
                
        }
        StringBuilder str=new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        str.reverse();
        return str.toString();
    }
}