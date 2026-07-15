class Solution {
    public int candy(int[] a) {
        int sum=0;
        int l[]=new int[a.length];
        int r[]=new int[a.length];
        Arrays.fill(l,1);
        Arrays.fill(r,1);
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>a[i-1])
            {
                l[i]=l[i-1]+1;
            }
        }
        for(int i=a.length-2;i>=0;i--)
        {
            if(a[i]>a[i+1])
            {
                r[i]=r[i+1]+1;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            sum+=Math.max(l[i],r[i]);
        }
        return sum;
    }
}