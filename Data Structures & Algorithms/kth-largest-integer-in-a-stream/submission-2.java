class KthLargest {

    int k=0;
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i=0;i<nums.length;i++)
        {
            if(i==k)
                break;
            pq.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++)
        {
            if(pq.peek()<nums[i])
            {
                pq.poll();
                pq.add(nums[i]);
            }
        }
    }
    
    public int add(int val) {
        if(pq.size()<k)
        {
            pq.add(val);
        }
        else
        {
        if(pq.peek()<val)
          {
            pq.poll();
            pq.add(val);
          }
        }
          return pq.peek();

    }
}
