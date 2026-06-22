class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int fre[]=new int[256];
        for(int i=0;i<s.length();i++)
        {
           fre[s.charAt(i)]++; 
        }
        for(int i=0;i<t.length();i++)
        {
           fre[t.charAt(i)]--; 
        }
        for(int i=0;i<fre.length;i++)
        {
            if(fre[i]!=0)
                return false;
        }
        return true;
    }
}
