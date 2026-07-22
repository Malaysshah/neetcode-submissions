class Solution {
    public int countSubstrings(String s) {
        char in[]=s.toCharArray();
        int len=in.length;
        int ans=len;
        int l=0,r=0;
        for(int i=0;i<in.length;i++)
        {
            l=i-1;
            r=i+1;
            while(l>=0 && r<len && in[l]==in[r])
            {
                l--;
                r++;
                ans++;
            }
            l=i;
            r=i+1;
            while(l>=0 && r<len && in[l]==in[r])
            {
                l--;
                r++;
                ans++;
            }
        }
        return ans;
    }
}
