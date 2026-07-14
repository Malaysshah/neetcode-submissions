class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<cost.length-2;i++)
        {
            c=Math.min(a+cost[i],b+cost[i+1]);
            a=b;
            b=c;
        }
        return Math.min(a+cost[cost.length-2],b+cost[cost.length-1]);
    }
}
