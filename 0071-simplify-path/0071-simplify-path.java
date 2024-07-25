class Solution {
    public String simplifyPath(String path) {
        Stack<String>st=new Stack<>();
        String arr[]=path.split("/");
        StringBuilder str=new StringBuilder();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i].equals("..") && !st.isEmpty())st.pop();
            else if(!arr[i].equals(".") && !arr[i].equals("..") && !arr[i].equals(""))
            st.push(arr[i]);
        }
        if(st.isEmpty())return "/";
        while(!st.isEmpty())
        {
            str.insert(0,st.pop()).insert(0,"/");
        }
        return str.toString();
    }
}