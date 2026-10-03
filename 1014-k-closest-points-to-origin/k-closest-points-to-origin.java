class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (a,b)->{
                // double bDis=Math.sqrt((b[0]*b[0])+(b[1]*b[1]));
                // double aDis=Math.sqrt((a[0]*a[0])+(a[1]*a[1]));
                // return Double.compare(bDis, aDis);
                int bDis = b[0] * b[0] + b[1] * b[1];
                int aDis = a[0] * a[0] + a[1] * a[1];

                return Integer.compare(bDis, aDis);
            }
        );

        for(int[] i:points){
            pq.add(i);
            while(pq.size()>k)
                pq.poll();
        }

        int[][] result=new int[k][2];
        for(int i=0;i<k;i++){
            result[i]=pq.poll();
        }

        return result;
    }
}