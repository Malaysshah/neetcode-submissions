class Solution {
    public int trap(int[] h) {
        if(h.length==0 || h.length==1)
            return 0;
        int l[]=new int[h.length];
        l[0]=h[0];
        int max=l[0];
        for(int i=1;i<h.length;i++)
        {
            if(h[i]>max)
            {
                max=h[i];
            }
            l[i]=max;
        }
        int sum=0;
        max=Integer.MIN_VALUE;
        for(int i=h.length-1;i>=0;i--)
        {
            if(h[i]>max)
                max=h[i];
            sum+=Math.min(max,l[i])-h[i];
        }
        return sum;

    }
}
