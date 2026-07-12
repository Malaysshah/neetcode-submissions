class Solution {
    public int maxProfit(int[] a) {
        int ans=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>a[i-1])
            {
                ans+=a[i]-a[i-1];
            }
        }
        return ans;
    }
}