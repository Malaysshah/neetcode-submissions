class Solution {
    public int romanToInt(String s) {
        char in[]=s.toCharArray();
        int i=0;
        int sum=0;
        while(i<in.length)
        {
            int prev=fun(in[i]);
            if(i+1<in.length)
            {
                int curr=fun(in[i+1]);
                if(prev<curr)
                {
                    sum+=(curr-prev);
                    i++;
                }
                else
                {
                    sum+=prev;
                }
            }
            else
            {
                sum+=prev;
            }
            i++;
        }
        return sum;
    }

    public int fun(char a)
    {
        switch(a){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}