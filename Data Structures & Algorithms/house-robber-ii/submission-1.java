class Solution {
    public int rob(int[] a) {
        if(a.length==1)
            return a[0];
        int inc=a[0];
        int exc=0;
        for(int i=1;i<a.length-1;i++)
        {
            int temp=exc+a[i];
            exc=Math.max(inc,exc);
            inc=temp;
        }
        int ans1=Math.max(inc,exc);
        inc=a[1];
        exc=0;
        for(int i=2;i<a.length;i++)
        {
            int temp=exc+a[i];
            exc=Math.max(inc,exc);
            inc=temp;
        }
        int ans2=Math.max(inc,exc);
        return Math.max(ans1,ans2);
    }
}
