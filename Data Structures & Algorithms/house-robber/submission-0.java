class Solution {
    public int rob(int[] a) {
        int inc=a[0];
        int exc=0;
        for(int i=1;i<a.length;i++)
        {
            int temp=exc+a[i];
            exc=Math.max(inc,exc);
            inc=temp;
        }
        return Math.max(inc,exc);
    }
}
