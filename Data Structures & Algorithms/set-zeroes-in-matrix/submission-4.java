class Solution {
    public void setZeroes(int[][] a) {
        int m=a.length;
        int n=a[0].length;
        boolean row=false;
        boolean col=false;
        for(int i=0;i<m;i++)
        {
            if(a[i][0]==0)
            {
                col=true;
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[0][i]==0)
            {
                row=true;
                break;
            }
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(a[i][j]==0)
                {
                    a[i][0]=0;
                    a[0][j]=0;
                }
            }
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(a[i][0]==0 || a[0][j]==0)
                {
                    a[i][j]=0;
                }
            }
        }
        if(row)
        {
            for(int i=0;i<n;i++)
            {
                a[0][i]=0;
            }
        }
        if(col)
        {
            for(int i=0;i<m;i++)
            {
                a[i][0]=0;
            }
        }
    }
}
