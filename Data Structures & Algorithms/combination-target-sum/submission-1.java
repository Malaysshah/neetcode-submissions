class Solution {
    List<List<Integer>> answer;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        answer=new ArrayList<>();
        fun(new ArrayList<>(),0,nums,target);
        return answer;
    }

    public void fun(List<Integer> ans,int index,int[] a, int target)
    {
        if(target==0)
        {
            answer.add(new ArrayList<>(ans));
            return;
        }
        if(a[index]>target)
        {
            return;
        }
        for(int i=index;i<a.length;i++)
        {
            ans.add(a[i]);
            fun(ans,i,a,target-a[i]);
            ans.remove(ans.size()-1);
        }
    }
}
