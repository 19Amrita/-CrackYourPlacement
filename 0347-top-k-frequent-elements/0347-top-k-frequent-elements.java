class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0; i<n; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair>q = new PriorityQueue<>();

        for(int key : map.keySet())
        {
            Pair p=new Pair(key,map.get(key));
            q.add(p);
            if(q.size()>k)q.remove();
        }
        int ans[]=new int[k];
        int i=0;
        while(!q.isEmpty())
        {
            Pair pq = q.remove();
            ans[i++]=pq.element;
        }
        return ans;
    }
    class Pair implements Comparable<Pair>
    {
        int freq;
        int element;
        Pair (int element, int freq)
        {
            this.element=element;
            this.freq=freq;
        }
        public int compareTo(Pair p)
        {
              return this.freq - p.freq;
        }
    } 
}