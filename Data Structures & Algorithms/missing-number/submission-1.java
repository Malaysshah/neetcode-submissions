class Solution {
    public int missingNumber(int[] a) {
        int ans=(a.length)*(a.length+1)/2;
        for(int i=0;i<a.length;i++)
        {
            ans-=a[i];
        }
        return ans;

    }
}
