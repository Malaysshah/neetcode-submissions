class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int l=0;
        int m=a.length; //1
        int n=a[0].length; //2
        int r=(m*n)-1; //1
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(a[mid/n][mid%n]==target)
            {
                return true;
            }
            else if(a[mid/n][mid%n]>target)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return false;
    }
}
