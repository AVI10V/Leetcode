class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int l=0;
        int e=r*c-1;

        while(l<=e){
            int mid=l+(e-l)/2;
            int row=mid/c;
            int col=mid%c;
            if(matrix[row][col]==target)return true;
            else if(matrix[row][col]<target){
                l=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;

        
    }
}