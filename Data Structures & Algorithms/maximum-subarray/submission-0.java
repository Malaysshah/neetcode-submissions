class Solution {
    public int maxSubArray(int[] a) {
        int sum=a[0],ans=a[0];
        for(int i=1;i<a.length;i++)
        {
            sum=Math.max(sum+a[i],a[i]);
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}
