class Solution {
    public int minDistance(String word1, String word2) {
        int ans[][]=new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<=word1.length();i++)
        {
            for(int j=0;j<=word2.length();j++)
            {
                if(i==0)
                {
                    ans[i][j]=j;
                    continue;
                } 
                else if(j==0)
                {
                    ans[i][j]=i;
                    continue;
                }
                else
                {
                    if(word1.charAt(i-1)==word2.charAt(j-1))
                    {
                        ans[i][j]=ans[i-1][j-1];
                    }
                    else
                    {
                        ans[i][j]=Math.min(ans[i-1][j-1],Math.min(ans[i-1][j],ans[i][j-1]))+1;
                    }
                }           
            }
        }
        return ans[word1.length()][word2.length()];
    }
}
