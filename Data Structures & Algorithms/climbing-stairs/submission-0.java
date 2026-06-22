class Solution {
    public int climbStairs(int n) {
        if(n<=2)
          return n;
        int a=1;
        int b=2;
        int c=0;
        int i=3;
        while(i<=n)
        {
            c=a+b;
            a=b;
            b=c;
            i++;
        }
        return c;
    }
}
