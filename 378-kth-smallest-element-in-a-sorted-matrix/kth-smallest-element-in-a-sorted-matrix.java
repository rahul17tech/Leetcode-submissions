class Solution {
    public boolean possible(int[][] matrix,int guess,int k){
        int n=matrix.length;
        int row=n-1;
        int col=0;
        int count=0;
        while(row>=0 && col<n){
            if(matrix[row][col]<=guess){
                count+=row+1;
                col++;
            }
            else
                row--;
        }
        return count>=k;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length; //rows=cols=n
        int low=matrix[0][0];
        int high=matrix[n-1][n-1];
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(matrix,mid,k)){
                res=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return res;
    }
}