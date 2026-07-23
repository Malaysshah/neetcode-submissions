class Solution {
    public boolean canPartition(int[] a) {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        if(sum%2!=0)
            return false;
        boolean ans[]=new boolean[sum/2+1];
        ans[0]=true;
        for(int i=0;i<a.length;i++)
        {
            for(int j=sum/2;j>=a[i];j--)
            {
                if(ans[j-a[i]])
                {
                    ans[j]=true;
                }
            }
        }
        return ans[sum/2];

    }
}
