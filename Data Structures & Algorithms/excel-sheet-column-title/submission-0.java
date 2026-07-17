class Solution {
    public String convertToTitle(int in) {
        StringBuilder sb=new StringBuilder();
        while(in>0)
        {
            in=in-1;
            sb.append((char)('A'+in%26));
            in=in/26;
        }
        return sb.reverse().toString();
    }
}