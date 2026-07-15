class Solution {
    public List<List<Integer>> fourSum(int[] a, int target) {
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(a);
        int n=a.length;
        if(n<4)
            return answer;
        int i=0;
        int j=0;
        while(i<n-3)
        {
            j=i+1;
            while(j<n-2)
            {
                long sum=(long)(target)-(long)a[i]-(long)a[j];
                int k=j+1;
                int l=n-1;
                while(k<l)
                {
                    if(a[k]+a[l]==sum)
                    {
                       List<Integer> ans=new ArrayList<>();
                       ans.add(a[i]);
                       ans.add(a[j]);
                       ans.add(a[k]);
                       ans.add(a[l]);
                       answer.add(ans);
                       k++;
                       l--;
                       while(k<l && a[k-1]==a[k])
                       {
                        k++;
                       }
                       while(k<l && a[l+1]==a[l])
                       {
                        l--;
                       }
                    }
                    else if(a[k]+a[l]>sum)
                    {
                        l--;
                    }
                    else
                    {
                        k++;
                    }
                }
                j++;
                while(j<n-2 && a[j-1]==a[j])
                {
                    j++;
                }
            }
            i++;
            while(i<n-3 && a[i-1]==a[i])
            {
                i++;
            }
        }
        return answer;
    }
}