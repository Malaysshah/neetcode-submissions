class Solution {
    public String addBinary(String a, String b) {
        char aa[]=a.toCharArray();
        char bb[]=b.toCharArray();
        int i=aa.length-1;
        int j=bb.length-1;
        int carry=0;
        int sum=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0 || j>=0)
        {
            sum=carry;
            if(i>=0)
            {
                sum+=aa[i]-'0';
                i--;
            }
            if(j>=0)
            {
                sum+=bb[j]-'0';
                j--;
            }
            sb.append(sum%2);
            carry=sum/2;
        }
        if(carry>0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}