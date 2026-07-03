class Solution {
    public int majorityElement(int[] a) {
        int fre=1;
        int ans=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]==ans)
            {
                fre++;
            }
            else
            {
                fre--;
                if(fre==0)
                {
                    ans=a[i];
                    fre++;
                }
            }
        }
        return ans;
    }
}