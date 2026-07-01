class Solution {
    public int search(int[] nums, int target) {
        int pivot=findPivot(nums,target);
        if(pivot==-1)
        {
            return find(nums,0,nums.length-1,target);
        }
        int x=find(nums,0,pivot,target);
        if(x==-1)
        {
            return find(nums,pivot+1,nums.length-1,target);
        }
        else
        {
            return x;
        }
    }

    public int findPivot(int[] a, int target)
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

    public int find(int[] a, int l, int r,int target)
    {
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(a[mid]==target)
            {
                return mid;
            }
            else if(a[mid]>target)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return -1;
    }
}
