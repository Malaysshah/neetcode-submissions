class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(a);
        int i=0;
        while(i<a.length-2)
        {
            int sum=-a[i];
            int j=i+1;
            int k=a.length-1;
            while(j<k)
            {
                if(a[j]+a[k]==sum)
                {
                    List<Integer> ans=new ArrayList<>();
                    ans.add(a[i]);
                    ans.add(a[j]);
                    ans.add(a[k]);
                    answer.add(ans);
                    j++;
                    k--;
                    while(j<k && a[j-1]==a[j])
                    {
                        j++;
                    }
                    while(j<k && a[k+1]==a[k])
                    {
                        k--;
                    }
                }
                else if(a[j]+a[k]<sum)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
            i++;
            while(i<a.length-2 && a[i-1]==a[i])
            {
                i++;
            }
        }
        return answer;
    }
}
