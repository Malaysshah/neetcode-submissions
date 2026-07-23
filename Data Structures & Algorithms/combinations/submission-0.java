class Solution {
    List<List<Integer>> answer;
    public List<List<Integer>> combine(int n, int k) {
        answer=new ArrayList<>();
        fun(new ArrayList<>(),n,k,1);
        return answer;
    }

    public void fun(List<Integer> ans,int n,int k, int curr){
        if(ans.size()==k){
            answer.add(new ArrayList<>(ans));
            return;
        }
        for(int i=curr;i<=n;i++)
        {
            ans.add(i);
            fun(ans,n,k,i+1);
            ans.remove(ans.size()-1);
        }
    }
}