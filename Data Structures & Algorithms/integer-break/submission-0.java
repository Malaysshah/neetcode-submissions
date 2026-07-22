class Solution {
    public int integerBreak(int n) {
        if(n==2)
            return 1;
        if(n==3)
            return 2;
        int threes=n/3;
        int reminder=n%3;
        if(reminder==1)
        {
            threes-=1;
            reminder=4;
        }
        else if(reminder==0)
        {
            reminder=1;
        }
        return (int)(Math.pow(3,threes)*reminder);
    }
}