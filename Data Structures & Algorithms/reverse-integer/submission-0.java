class Solution {
    public int reverse(int x) {
        boolean minus=false;
        if(x<0)
        {
            x=-x;
            minus=true;
        }
        long ans=0;
        while(x>0)
        {
            ans=ans*10+x%10;
            x=x/10;
        }
        if(minus)
            ans=-ans;
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE)
            return 0;
        return (int)ans;
        
    }
}
