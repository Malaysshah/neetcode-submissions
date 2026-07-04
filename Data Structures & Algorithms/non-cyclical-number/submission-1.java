class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        set.add(n);
        while(n!=1)
        {
            n=fun(n);
            if(set.contains(n))
            {
                return false;
            }
            set.add(n);
        }
        return true;

    }

    public int fun(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=(n%10)*(n%10);
            n=n/10;
        }
        return sum;
    }
}
