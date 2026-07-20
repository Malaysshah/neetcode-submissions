class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int map[]=new int[128];
        for(int i=0;i<s1.length();i++)
        {
            map[s1.charAt(i)]++;
        }
        int count=s1.length();
        int left=0;
        int right=0;
        while(right<s2.length())
        {
            if(map[s2.charAt(right++)]-->0) {
                count--;
            }
            while(count==0)
            {
                if(right-left==s1.length())
                    return true;
                if(++map[s2.charAt(left++)]>0)
                    count++;
            }
        }
        return false;
    }
}
