class Solution {
    public int minSubArrayLen(int target, int[] a) {
        int start=0;
        int end;
        int i=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        while(i<a.length)
        {
            end=i;
            sum+=a[i];
            while(sum>=target)
            {
                ans=Math.min(ans,end-start+1);
                sum-=a[start++];
            }
            i++;
        }
        if(ans==Integer.MAX_VALUE)
            return 0;
        return ans;
    }
}