class Solution {
    public int eraseOverlapIntervals(int[][] i) {
        int count=1;
        int n=i.length;
        Arrays.sort(i,(a,b)->a[1]-b[1]);
        int pre=0;
        for(int j=1; j<n; j++)
        {
            if(i[j][0]>=i[pre][1])
            {
                count++;
                pre=j;
            }
        }
        return n-count;
    }
}