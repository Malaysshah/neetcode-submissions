class Solution {
    public void rotate(int[] a, int k) {
       int n=a.length;
       k=k%n;
       rotate(a,0,n-k-1);
       rotate(a,n-k,n-1);
       rotate(a,0,n-1); 
    }

    public void rotate(int[] a, int l,int r)
    {
        while(l<=r)
        {
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
    }
}
