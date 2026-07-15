class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        ans[0]=0;
        int p=1;
        int pow=1;
        for(int i=1;i<=n;i++)
        {
            if(i==pow)
            {
                ans[i]=1;
                p=1;
                pow=pow<<1;
            }
            else
            {
                ans[i]=ans[p]+1;
                p++;
            }
        }
        return ans;
    }
}
