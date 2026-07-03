class Solution {
    public int[] topKFrequent(int[] a, int k) {
        int ans[]=new int[k];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        List<Custom> li=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            li.add(new Custom(entry.getKey(),entry.getValue()));
        }
        Collections.sort(li,(aa,bb)->bb.fre-aa.fre);
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=li.get(i).getKey();
        }
        return ans;

    }
}

class Custom{
    int key;
    int fre;
    Custom(int key,int fre)
    {
        this.key=key;
        this.fre=fre;
    }
    public int getKey(){
        return this.key;
    }
}
