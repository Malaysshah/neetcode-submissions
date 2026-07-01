class Solution {
    public int findMin(int[] nums) {
        int pivot=findPivot(nums);
        if(pivot==-1)
            return nums[0];
        else
            return nums[pivot+1];
    }

    public int findPivot(int[] a)
    {
        int l=0;
        int r=a.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(mid+1<a.length && a[mid]>a[mid+1])
            {
                return mid;
            }
            if(mid-1>=0 && a[mid-1]>a[mid])
            {
                return mid-1;
            }
            if(a[l]<a[mid])
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return -1;
    }
}
