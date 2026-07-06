class Solution {
    public int lengthOfLongestSubstring(String s) {
        int index[]=new int[256];
        int ans=0;
        Arrays.fill(index,-1);
        int start=0;
        int end=0;
        char in[]=s.toCharArray();
        for(int i=0;i<in.length;i++)
        {
            end=i;
            if(index[in[i]]!=-1)
            {
                start=Math.max(start,index[in[i]]+1);
            }
            index[in[i]]=i;
            ans=Math.max(end-start+1,ans);
        }
        return ans;
    }
}
