class Solution {
    public void sortColors(int[] a) {
        int lo=0;
        int mid=0;
        int hi=a.length-1;
        int temp=0;
        while(mid<=hi)
        {
            if(a[mid]==1)
            {
                mid++;
            }
            else if(a[mid]==0)
            {
                temp=a[mid];
                a[mid]=a[lo];
                a[lo]=temp;
                lo++;
                mid++;
            }
            else
            {
                temp=a[mid];
                a[mid]=a[hi];
                a[hi]=temp;
                hi--;
            }
        }
    }
}