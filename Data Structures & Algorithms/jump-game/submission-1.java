class Solution {
    public boolean canJump(int[] a) {
        boolean ans[]=new boolean[a.length];
        ans[0]=true;
        for(int i=1;i<a.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(ans[j] && i-j<=a[j])
                {
                    ans[i]=true;
                    break;
                }
            }
        }
        return ans[a.length-1];
    }
}
