class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] preAns=new int[intervals.length+1][2];
        int ind=0;
        boolean insert=false;
        for(int[] range:intervals){
            if(range[0]>= newInterval[0] && !insert){
                preAns[ind]=newInterval;
                ind++;
                insert=true;
            }
            preAns[ind]=range;
            ind++;
        }
        if(!insert){
            preAns[ind]=newInterval;
        }

        int[][] ans=new int[preAns.length][2];
        int index=0;
        int start1=preAns[0][0];
        int end1=preAns[0][1];
        for(int i=1;i<preAns.length;i++){
            int start2=preAns[i][0];
            int end2=preAns[i][1];

            if(end1>=start2){
                end1=Math.max(end1,end2);
            }
            else{
                ans[index][0]=start1;
                ans[index][1]=end1;
                index++;

                start1=start2;
                end1=end2;
            }
        }
        ans[index][0]=start1;
        ans[index][1]=end1;

        return Arrays.copyOf(ans,index+1);
    }
}