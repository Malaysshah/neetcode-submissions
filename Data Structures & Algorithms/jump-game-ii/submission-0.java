class Solution {
    public int jump(int[] a) {
        int jumps=0;
        int currEnd=0;
        int currFarthest=0;
        for(int i=0;i<a.length-1;i++)
        {
            currFarthest=Math.max(currFarthest,i+a[i]);
            if(currEnd==i)
            {
                currEnd=currFarthest;
                jumps++;
            }
        }
        return jumps;
    }
}
