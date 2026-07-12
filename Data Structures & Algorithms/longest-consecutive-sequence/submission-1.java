class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        for (int num : nums)
        {
            set.add(num);
        }
        int ans=0;
        for(int num : nums)
        {
            if(!set.contains(num-1))
            {
                int sum=1;
                int temp=num+1;
                while(set.contains(temp++))
                {
                    sum++;
                }
                if(sum>ans)
                    ans=sum;
            }
        }
        return ans;
    }
}
