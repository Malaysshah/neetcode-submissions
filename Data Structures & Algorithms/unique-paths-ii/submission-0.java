class Solution {
    public int uniquePathsWithObstacles(int[][] a) {
        int m=a.length;
        int n=a[0].length;
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            if(a[i][0]==1)
                break;
            ans[i][0]=1;
        }
        for(int i=0;i<n;i++)
        {
            if(a[0][i]==1)
                break;
            ans[0][i]=1;
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(a[i][j]!=1)
                {
                    ans[i][j]=ans[i-1][j]+ans[i][j-1];
                }
            }
        }
        return ans[m-1][n-1];
    }
}