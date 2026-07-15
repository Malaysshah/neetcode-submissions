class Solution {
    public boolean canJump(int[] a) {
        int pos=a.length-1;
        for(int i=a.length-1;i>=0;i--)
        {
            if(i+a[i]>=pos)
                pos=i;
        }
        return pos==0;
    }
}
