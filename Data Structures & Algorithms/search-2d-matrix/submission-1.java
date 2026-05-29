class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rowlen=matrix.length;
        int collen=matrix[0].length;
        int left=0;
        int right=(rowlen*collen)-1;
        while(left<=right){

            int mid=left + (right - left) / 2; //5
            int row=mid/collen;
            int column=mid%collen;

            if(matrix[row][column]==target){
                return true;
            }
            if(matrix[row][column]<target){
                left=mid+1;
            }
            if(matrix[row][column]>target){
                right=mid-1;
            }
        }
        return false;
    }
}
