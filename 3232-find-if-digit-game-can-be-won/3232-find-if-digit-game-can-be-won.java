class Solution {
    public boolean canAliceWin(int[] nums) {
        int alice=0;
        int bob=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>9){
                bob+=nums[i];
                
}
            else{
                alice+=nums[i];
}
}
        if(alice==bob)return false;
        return true;
    }
}