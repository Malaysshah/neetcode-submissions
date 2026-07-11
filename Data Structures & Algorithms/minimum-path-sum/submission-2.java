class Solution {
    public int minPathSum(int[][] a) {
        int ans[][]=new int[a.length][a[0].length];
        ans[0][0]=a[0][0];
        for(int i=1;i<a.length;i++)
        {
            ans[i][0]=a[i][0]+ans[i-1][0];
        }
        for(int i=1;i<a[0].length;i++)
        {
            ans[0][i]=a[0][i]+ans[0][i-1];
        }
        for(int i=1;i<a.length;i++)
        {
            for(int j=1;j<a[0].length;j++)
            {
                ans[i][j]=Math.min(ans[i-1][j],ans[i][j-1])+a[i][j];
            }
        }
        return ans[a.length-1][a[0].length-1];
    }
}