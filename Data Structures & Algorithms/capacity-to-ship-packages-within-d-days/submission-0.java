class Solution {
    public int shipWithinDays(int[] a, int d) {
        int l=0;
        int r=0;
        for(int i=0;i<a.length;i++)
        {
            l=Math.max(a[i],l);
            r+=a[i];
        }
        int ans=r;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(fun(mid,a,d))
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

    public boolean fun(int mid,int a[],int d)
    {
        int count=1;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            if(sum>mid)
            {
                count++;
                if(count>d)
                    return false;
                sum=a[i];
            }
        }
        return true;
    }
}