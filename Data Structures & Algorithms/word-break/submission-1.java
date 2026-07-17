class Solution {
    public boolean wordBreak(String in, List<String> wordDict) {
        Set<String> set=new HashSet<>(wordDict);
        boolean ans[]=new boolean[in.length()+1];
        ans[0]=true;
        for(int i=1;i<ans.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(ans[j] && set.contains(in.substring(j,i)))
                {
                    ans[i]=true;
                }
            }
        }
        return ans[in.length()];
    }
}
