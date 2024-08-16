class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=s.length();
        for(int i=0; i<n; i++)
        {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        StringBuilder str=new StringBuilder();
        pq.addAll(map.keySet());
        while(pq.size()>=2)
        {
            char ch=pq.poll();
            char ch1=pq.poll();
            str.append(ch);
            str.append(ch1);
            map.put(ch, map.get(ch) - 1);
            map.put(ch1, map.get(ch1) - 1);
            if(map.get(ch) > 0) pq.offer(ch);
            if(map.get(ch1) > 0) pq.offer(ch1);

        }
        if(!pq.isEmpty())
        {
            char ch=pq.poll();
            if(map.get(ch)>1)return "";
            str.append(ch);
        }
        return str.toString();
    }
}