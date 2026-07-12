class Solution {
    public int[] sortArray(int[] a) {
        sort(a,0,a.length-1);
        return a;
    }

    public void sort(int[] a,int l, int r)
    {
        if(l<r)
        {
            int m=l+(r-l)/2;
            sort(a,l,m);
            sort(a,m+1,r);
            merge(a,l,m,r);
        }
    }

    public void merge(int[] a,int l, int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++)
        {
            left[i]=a[l+i];
        }
        for(int i=0;i<n2;i++)
        {
            right[i]=a[m+1+i];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            {
                a[k++]=left[i++];
            }
            else
            {
                a[k++]=right[j++];
            }
        }
        while(i<n1)
        {
            a[k++]=left[i++];
        }
        while(j<n2)
        {
            a[k++]=right[j++];
        }
    }
}