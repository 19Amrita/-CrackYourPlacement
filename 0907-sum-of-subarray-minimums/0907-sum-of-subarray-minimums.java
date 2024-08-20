class Solution {
    int mod=1000000007;
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        long ans=0;
        int nsl[]=getnsl(arr,n);
        int nsr[]=getnsr(arr,n);
        for(int i=0;i<n;i++)
        {
            int li=i-nsl[i];
            int ri=nsr[i]-i;
           long product = (long) li * ri % mod;
           long pro = (long) arr[i] * product % mod; 
            ans=(ans+pro)%mod;
        }
        return (int)ans;
    }
    public int[] getnsl(int []arr,int n)
    {
        Stack<Integer>st=new Stack<>();
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(st.isEmpty()){
                temp[i]=-1;
                
}
            else
            {
                while(!st.isEmpty() && arr[i]<=arr[st.peek()])
                {
                    st.pop();
                }
                temp[i]=st.isEmpty()?-1:st.peek();
}
            st.push(i);
}
        return temp;
 }
        public int[] getnsr(int []arr,int n)
    {
        Stack<Integer>st=new Stack<>();
        int temp[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            if(st.isEmpty()){
                temp[i]=n;
                
}
            else
            {
                while(!st.isEmpty() && arr[i]<arr[st.peek()])
                {
                    st.pop();
                }
                temp[i]=st.isEmpty()?n:st.peek();
}
            st.push(i);
}
        return temp;
 }
}