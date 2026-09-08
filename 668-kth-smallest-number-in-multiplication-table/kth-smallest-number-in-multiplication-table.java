class Solution {
    public boolean possible(int m,int n,int guess,int k){
        int row=m;
        int col=1;
        int count=0;
        while(row>=0 && col<=n){
            int element=row*col;
            if(element<=guess){
                count+=row;
                col++;
            }
            else
                row--;
        }
        return count>=k;
    }
    public int findKthNumber(int m, int n, int k) {
        int low=1;
        int high=m*n;
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(m,n,mid,k)){
                res=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return res;
    }
}