class Solution {
    public String longestPalindrome(String s) {
        char in[]=s.toCharArray();
        int l=0,r=0;
        int ans=0;
        int start=0;
        int end=0;
        for(int i=0;i<in.length;i++)
        {
            l=i;
            r=i+1;
            while(l>=0 && r<in.length && in[l]==in[r])
            {
                l--;
                r++;
            }
            if(ans<r-l-1)
            {
                ans=r-l-1;
                start=l+1;
                end=r-1;
            }
            l=i-1;
            r=i+1;
            while(l>=0 && r<in.length && in[l]==in[r])
            {
                l--;
                r++;
            }
            if(ans<r-l-1)
            {
                ans=r-l-1;
                start=l+1;
                end=r-1;
            }
        }
        return s.substring(start,end+1);
    }
}
