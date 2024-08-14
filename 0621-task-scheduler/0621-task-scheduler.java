class Solution {
    public int leastInterval(char[] tasks, int n) {
        int m=tasks.length;
        if(n==0)return n;
        int []ar=new int[26];
        
        for(char ch:tasks)
        {
            ar[ch-'A']++;
        }
        Arrays.sort(ar);
        int max=ar[25];
        int gap=max-1;
        int idle=gap*n;
        for(int i=24;i>=0;i--)
        {
             idle-=Math.min(gap,ar[i]);
        }
        if(idle>0){
            return idle + m;
        }
        return m;
    }
}