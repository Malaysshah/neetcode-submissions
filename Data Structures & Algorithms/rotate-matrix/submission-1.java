class Solution {
    public void rotate(int[][] in) {
        int m=in.length;
        int n=in[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=in[i][j];
                in[i][j]=in[j][i];
                in[j][i]=temp;
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int temp=in[i][j];
                in[i][j]=in[i][n-1-j];
                in[i][n-1-j]=temp;
            }
        }
    }
}
