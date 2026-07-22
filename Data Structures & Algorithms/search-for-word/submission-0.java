class Solution {
    public boolean exist(char[][] a, String word) {
        int m=a.length;
        int n=a[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(dfs(a,i,j,0,word))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] a, int i, int j, int k,String word)
    {
        if(i<0 || j<0 || i>=a.length || j>=a[0].length)
            return false;
        if(word.charAt(k)==a[i][j])
        {
            if(k==word.length()-1)
                return true;
            char temp=a[i][j];
            a[i][j]='*';
            if(dfs(a,i-1,j,k+1,word) || dfs(a,i+1,j,k+1,word) || dfs(a,i,j-1,k+1,word) || dfs(a,i,j+1,k+1,word))
            {
                return true;
            }
            a[i][j]=temp;
        }
        return false;
    } 
}
