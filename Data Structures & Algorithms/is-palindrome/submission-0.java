class Solution {
    public boolean isPalindrome(String s) {
        char in[]=s.toCharArray();
        int l=0;
        int r=in.length-1;
        while(l<r)
        {
            while(l<r && !fun(in[l]))
            {
                l++;
            }
            while(l<r && !fun(in[r]))
            {
                r--;
            }
            if(Character.toLowerCase(in[l])!=Character.toLowerCase(in[r]))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean fun(char a)
    {
        if((a>='A' && a<='Z') || (a>='a' && a<='z') || (a>='0' && a<='9'))
            return true;
        return false;
    }
}
