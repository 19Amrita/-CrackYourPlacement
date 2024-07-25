class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        solve(ans,0,0,n,"");
        return ans;
    }
      private void solve(List<String>ans,int open,int close,int n,String op)
    {
        if(open==n && close==n)
        {
            ans.add(op);
            return;
        }
        if(open!=n)
        {
           solve(ans,open+1,close,n,op+'(');
        }
        if(open>close)
        {
            solve(ans,open,close+1,n,op+')');
        }
    }
}