class Solution {
    List<List<Integer>> answer;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        answer=new ArrayList<>();
        fun(new ArrayList<>(),0,candidates,target);
        return answer;
    }

    public void fun(List<Integer> ans,int index,int[] a, int target)
    {
        if(target==0)
        {
            answer.add(new ArrayList<>(ans));
            return;
        }
        
        for(int i=index;i<a.length;i++)
        {
            if(a[index]>target)
            {
            return;
            }
            if(i!=index && a[i]==a[i-1])
            {
                continue;
            }
            ans.add(a[i]);
            fun(ans,i+1,a,target-a[i]);
            ans.remove(ans.size()-1);
        }
    }
}
