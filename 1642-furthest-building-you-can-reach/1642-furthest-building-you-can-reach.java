class Solution {
    public int furthestBuilding(int[] h, int br, int l) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a, b)-> b - a );
        int i=0;
        int n=h.length;
        for(i=0;i<n-1;i++){
              int diff=h[i+1]-h[i];
              if(diff>0)
              {
                if(br>=diff)
                {
                    br-=diff;
                    pq.offer(diff);
                }
                else if(l>0)
                {
                    if(!pq.isEmpty() && diff<pq.peek())
                    {
                        
                        br+=pq.peek()-diff;
                        pq.poll();
                        pq.offer(diff);
                        l--;
                    }
                    else{
                        l--;
                    }
                }
                else{
                    break;
                }
              }
        }
        return i;
    }
}