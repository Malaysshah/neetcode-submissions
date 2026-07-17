class Solution {
    public int coinChange(int[] coins, int amount) {
        int ans[]=new int[amount+1];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[0]=0;
        for(int i=1;i<ans.length;i++)
        {
            for(int j=0;j<coins.length;j++)
            {
                if(i>=coins[j] && ans[i-coins[j]]!=Integer.MAX_VALUE)
                {
                    ans[i]=Math.min(ans[i],ans[i-coins[j]]+1);
                }
            }
        }
        if(ans[amount]==Integer.MAX_VALUE)
            return -1;
        return ans[amount];
    }
}
