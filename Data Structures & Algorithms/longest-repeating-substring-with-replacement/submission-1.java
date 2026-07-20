class Solution {
    public int characterReplacement(String s, int k) {
        char in[]=s.toCharArray();
        int l=0;
        int ans=0;
        int len=0;
        int f[]=new int[256];
        int max=0;
        int diff=0;
        for(int r=0;r<in.length;r++)
        {
            f[in[r]]++;
            max=Math.max(max,f[in[r]]);
            len=r-l+1;
            diff=len-max;
            if(diff>k)
            {
                f[in[l]]--;
                l++;
                len=r-l+1;
                diff=len-max;
            }
            ans=Math.max(ans,len);
        }
        return ans;
    }
}
