class Solution {
    public int mySqrt(int x) {
        if(x<=1)
            return x;
        int l=1;
        int r=x/2;
        int ans=0;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if((long)mid*mid==x)
            {
                return (int)mid;
            }
            else if((long)mid*mid>x)
            {
                r=mid-1;
            }
            else
            {
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
}