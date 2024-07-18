class Solution {
    public int reverse(int x) {
      
        int temp=x;
        int sum=0;
        while(temp!=0)
        {
            int b=temp%10;
            if(sum>Integer.MAX_VALUE/10 || sum<Integer.MIN_VALUE/10){
                return 0;
}
            sum=10*sum+b;
            temp/=10;
        }
        
        return sum;
    }
}