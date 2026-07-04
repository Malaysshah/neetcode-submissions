class Solution {
    public int singleNumber(int[] a) {
        int ans=a[0];
        for(int i=1;i<a.length;i++){
            ans^=a[i];
        }
        return ans;
    }
}
