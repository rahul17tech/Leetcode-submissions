class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i:piles)
            high=Math.max(i,high);

        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            long totalTime=0;
            for(int i:piles){
                totalTime+=(i+mid-1)/mid;//Math.ceil(i/mid);
            }
            if(totalTime<=h){
                res=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return res;
    }
}