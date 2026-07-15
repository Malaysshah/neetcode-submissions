class Solution {
    List<String> answer;
    public List<String> generateParenthesis(int n) {
        answer=new ArrayList<>();
        fun("",n,n);
        return answer;
    }

    public void fun(String curr,int left,int right)
    {
        if(left>right)
            return;
        if(left==0 && right==0)
        {
            answer.add(curr);
            return;
        }
        if(left>0)
            fun(curr+"(",left-1,right);
        if(right>0)
            fun(curr+")",left,right-1);
    }
}
