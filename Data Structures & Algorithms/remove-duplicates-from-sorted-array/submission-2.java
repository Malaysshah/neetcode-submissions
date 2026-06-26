class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        while(i<nums.length-1)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[j++]=nums[i];
            }
            i++;
        }
        nums[j++]=nums[nums.length-1];
        return j;
    }
}