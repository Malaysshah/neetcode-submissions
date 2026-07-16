class Solution {
    public int subarraySum(int[] a, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            if(map.containsKey(sum-k))
            {
                ans+=map.get(sum-k);
            }
            if(map.get(sum)!=null)
            {
                map.put(sum,map.get(sum)+1);
            }
            else
            {
                map.put(sum,1);
            }
            if(sum==k)
                ans+=1;
        }
        return ans;
    }
}