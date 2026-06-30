class Solution {
    public int mySqrt(int x) {
        if(x<=1)
            return x;
        long l=1;
        long r=x/2;
        long ans=0;
        while(l<=r)
        {
            long mid=l+(r-l)/2;
            if((int)mid*mid==x)
            {
                return (int)mid;
            }
            else if(mid*mid>x)
            {
                r=mid-1;
            }
            else
            {
                ans=mid;
                l=mid+1;
            }
        }
        return (int)ans;
    }
}