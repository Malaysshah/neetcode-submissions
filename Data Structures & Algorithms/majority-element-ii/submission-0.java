class Solution {
    public List<Integer> majorityElement(int[] a) {
        List<Integer> ans=new ArrayList<>();
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MAX_VALUE;
        int count1=0;
        int count2=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==max1)
            {
                count1++;
                continue;
            }
            if(a[i]==max2)
            {
                count2++;
                continue;
            }
            if(count1==0)
            {
                max1=a[i];
                count1++;
                continue;
            }
            if(count2==0)
            {
                max2=a[i];
                count2++;
                continue;
            }
            count1--;
            count2--;
        }
        count1=0;
        count2=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==max1)
                count1++;
            else if(a[i]==max2)
                count2++;
        }
        if(count1>a.length/3)
            ans.add(max1);
        if(count2>a.length/3)
            ans.add(max2);
        return ans;


    }
}