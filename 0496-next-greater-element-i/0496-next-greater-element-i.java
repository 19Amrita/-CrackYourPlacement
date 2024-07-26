class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<nums1.length;i++)
        {
            boolean flag=false;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j]){
                    flag=true;
}
                if(flag==true && nums1[i]<nums2[j]){
                    ans[i]=nums2[j];
                    flag=false;
                    break;
}
            }
         }
        return ans;
    }
}