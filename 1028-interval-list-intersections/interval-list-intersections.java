class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> res=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<firstList.length && j<secondList.length){
            int start1=firstList[i][0];
            int end1=firstList[i][1];

            int start2=secondList[j][0];
            int end2=secondList[j][1];

            if(start1<=start2){
                //overlap condition
                if(end1>=start2){
                    //intersection
                    int s=Math.max(start1,start2);
                    int e=Math.min(end1,end2);
                    res.add(new int[]{s,e});
                }
            }
            else{//start2<=start1
                //overlap condition
                if(end2>=start1){
                    //intersection
                    int s=Math.max(start1,start2);
                    int e=Math.min(end1,end2);
                    res.add(new int[]{s,e});
                }
            }

            //which one to increase
            if(end1<=end2)
                i++;
            else
                j++;
        }
        return res.toArray(new int[res.size()][]);
    }
}