class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        int open=0;
        int ast=0;
        char in[]=s.toCharArray();
        for(int i=0;i<in.length;i++)
        {
            if(in[i]=='(')
            {
                st1.push(i);
                open++;
            }
            else if(in[i]==')')
            {
                if(open>0)
                {
                    open--;
                    st1.pop();
                }
                else if(ast>0)
                {
                    ast--;
                    st2.pop();
                }
                else
                {
                    return false;
                }
            }
            else
            {
                ast++;
                st2.push(i);
            }
        }

        while(!st1.isEmpty() && !st2.isEmpty())
        {
            int openIndex=st1.pop();
            int astIndex=st2.pop();
            if(astIndex<openIndex)
                return false;
        }
        if(!st1.isEmpty())
            return false;
        return true;
    }
}
