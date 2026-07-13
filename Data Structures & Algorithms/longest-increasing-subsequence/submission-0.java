class Solution {
    public int lengthOfLIS(int[] a) {
        int ans[]=new int[a.length];
        Arrays.fill(ans,1);
        int answer=1;
        for(int i=1;i<ans.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[j]<a[i] && ans[j]+1>ans[i])
                {
                    ans[i]=ans[j]+1;
                    answer=Math.max(answer,ans[i]);
                }
            }
        }
        return answer;
    }
}
