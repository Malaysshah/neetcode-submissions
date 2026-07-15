class Solution {
    public int minEatingSpeed(int[] a, int h) {
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        int l=1;
        int r=max;
        int ans=0;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            System.out.println(mid+ " "+fun(a,mid));
            if(fun(a,mid)<=h)
            {
                ans=mid;
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;

    }
    public int fun(int a[],int x)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%x==0)
            {
                sum+=(a[i]/x);
            }
            else
            {
                sum+=(a[i]/x+1);
            }
        }
        return sum;
    }
}
