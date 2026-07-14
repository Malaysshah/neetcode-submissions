class Solution {
    public boolean validPalindrome(String s) {
        char in[]=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(in[i]==in[j])
            {
                i++;
                j--;
            }
            else
            {
                return fun(in,i+1,j) || fun(in,i,j-1);
            }
        }
        return true;    
}

    public boolean fun(char in[],int l, int r)
    {
        while(l<r)
        {
            if(in[l]!=in[r])
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}