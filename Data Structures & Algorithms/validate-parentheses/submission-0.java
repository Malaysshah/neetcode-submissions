class Solution {
    public boolean isValid(String s) {
        char in[]=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(char input:in)
        {
            if(input=='{' || input=='(' || input=='[')
            {
                st.push(input);
            }
            else {
                if(st.isEmpty())
                {
                    return false;
                }
                char temp=st.pop();
                if(input=='}' && temp!='{')
                    return false;
                if(input==']' && temp!='[')
                    return false;
                if(input==')' && temp!='(')
                    return false;
            }
        }
        return st.isEmpty();
    }
}
