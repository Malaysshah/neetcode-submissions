class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int curr=0;
        int start[]=new int[1001];
        int end[]=new int[1001];
        for(int i=0;i<trips.length;i++)
        {
            start[trips[i][1]]+=trips[i][0];
            end[trips[i][2]]+=trips[i][0];
        }
        for(int i=0;i<1001;i++)
        {
            curr+=start[i];
            curr-=end[i];
            if(curr>capacity)
                return false;
        }
        return true;
    }
}