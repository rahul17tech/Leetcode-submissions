class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int[][] ans=new int[intervals.length][2];

        int start1=intervals[0][0];
        int end1=intervals[0][1];
        int index=0;//index for ans array

        for(int i=1;i<intervals.length;i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];
            if(end1>=start2){//merge
                start1=start1;
                end1=Math.max(end1,end2);
            }
            else{//no merge
                ans[index][0]=start1;
                ans[index][1]=end1;
                index++;

                start1=start2;
                end1=end2;
            }
        }
        //last er tar sathe merge hole, merged ta ans e rakhbo, ar merge na hole last jeta unmerged pore roilo mane jetar sathe porer kichu compare korar nei seta ke ans e add kore dilam.
        ans[index][0]=start1; 
        ans[index][1]=end1;

        return Arrays.copyOf(ans,index+1);
    }
}