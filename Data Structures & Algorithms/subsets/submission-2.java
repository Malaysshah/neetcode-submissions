class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> answer=new ArrayList<>();
        for(int i=0;i<Math.pow(2,n);i++)
        {
            List<Integer> curr=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))!=0)
                {
                    curr.add(nums[j]);
                }
            }
            answer.add(curr);
        }
        return answer;
    }
}
