class Solution {
    public List<Integer> findClosestElements(int[] a, int k, int x) {
        List<Integer> ans=new ArrayList<>();
        int index=find(a,x); //2
        int l=index;
        int r=index+1;
        while(k>0 && l>=0 && r<a.length)
            {
                if(Math.abs(a[l]-x)<=Math.abs(a[r]-x))
                {
                    ans.add(a[l--]);
                }
                else
                {
                    ans.add(a[r++]);
                }
                k--;
            }
        while(k>0 && l>=0)
        {
            ans.add(a[l--]);
            k--;
        }
        while(r<a.length && k>0)
        {
            ans.add(a[r++]);
            k--;
        }
        Collections.sort(ans);
        return ans;
    }

    public int find(int[] a, int x)
    {
        int l=0;
        int r=a.length-1;
        int ans=0;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(a[mid]==x)
            {
                return mid;
            }
            else if(a[mid]>x)
            {
                r=mid-1;
            }
            else {
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
}