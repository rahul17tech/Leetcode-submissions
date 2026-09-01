class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int startCol=0;
        int startRow=rows-1;
        while(startRow>=0 && startCol<cols){
            if(matrix[startRow][startCol]==target)
                return true;
            else if(matrix[startRow][startCol]>target)
                startRow--;
            else
                startCol++;
        }
        return false;
    }
}