class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        fun(answer,nums,new ArrayList<>(),0);
        return answer;
    }

    public void fun(List<List<Integer>> answer,int[] nums,List<Integer> temp,int start)
    {
        answer.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++)
        {
            temp.add(nums[i]);
            fun(answer,nums,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
