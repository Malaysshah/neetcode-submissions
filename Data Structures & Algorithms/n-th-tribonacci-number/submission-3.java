class Solution {
    public int tribonacci(int n) {
        if(n<=1)
          return n;
        if(n==2)
            return 1;
        int a=0;
        int b=1;
        int c=1;
        int d=0;
        int i=3;
        while(i<=n)
        {
            d=a+b+c;
            a=b;
            b=c;
            c=d;
            i++;
        }
        return d;
    }
}