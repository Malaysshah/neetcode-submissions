class Solution {
    public int maxProduct(int[] a) {
        int left=1;
        int right=1;
        int ans=a[0];
        for(int i=0;i<a.length;i++)
        {
            left=left==0?1:left;
            right=right==0?1:right;
            left*=a[i];
            right*=a[a.length-1-i];
            ans=Math.max(ans,Math.max(left,right));
        }
        return ans;
    }
}
