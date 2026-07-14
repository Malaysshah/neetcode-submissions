class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char aa[]=text1.toCharArray();
        char bb[]=text2.toCharArray();
        int ans[][]=new int[aa.length+1][bb.length+1];
        for(int i=0;i<ans.length;i++)
        {
            ans[i][0]=0;
        }
        for(int i=0;i<ans[0].length;i++)
        {
            ans[0][i]=0;
        }
        for(int i=1;i<ans.length;i++)
        {
            for(int j=1;j<ans[0].length;j++)
            {
                if(aa[i-1]==bb[j-1])
                {
                    ans[i][j]=ans[i-1][j-1]+1;
                }
                else
                {
                    ans[i][j]=Math.max(ans[i-1][j],ans[i][j-1]);
                }
            }
        }
        return ans[aa.length][bb.length];

    }
}
