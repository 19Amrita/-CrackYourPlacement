class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int i=0;
        int j=0;
        int max=0;
        int ans=0;
        while(i<s.length())
        {
            //condition for k freq check
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            max=Math.max(max,map.get(s.charAt(i)));
            while(i-j+1-max>k){
                 map.put(s.charAt(j),map.get(s.charAt(j))-1);
                j++;
}
            ans=Math.max(i-j+1,ans);
            i++;
}
        return ans;
    }
}