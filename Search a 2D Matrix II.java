class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0,column = matrix[row].length-1;
        
        while(column >= 0 && row < matrix.length){
            if(target == matrix[row][column]) {
                return true;
            } else if(target < matrix[row][column]) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }
}