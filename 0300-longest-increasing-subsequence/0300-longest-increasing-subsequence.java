class Solution {
    public int lengthOfLIS(int[] nums) 
    {
        int n=nums.length;
        int dp[][]=new int[n][n];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return solve(-1,0,nums,dp);
    }
    private int solve(int prev,int curr,int []nums,int dp[][])
    {
        int n=nums.length;
        //base case
        if(curr>=n)
        return 0;
        int select=0;
        if(prev!=-1 && dp[curr][prev]!=-1)return dp[curr][prev];
        if(prev==-1 || nums[curr]>nums[prev])
        {
             select=1+solve(curr,curr+1,nums,dp);
        }
        int skip=solve(prev,curr+1,nums,dp);
        if(prev!=-1){
              dp[curr][prev]=Math.max(skip,select);
        }
        return Math.max(skip,select);
    }
    private int tab(int []nums)
    {
        int n=nums.length;
        int dp[][]=new int[n+1][n+1];
        
        return dp[n][n];
    }
}