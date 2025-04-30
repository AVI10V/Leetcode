class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int[][]dp = new int[n][n];
        for(int[] x:dp){
            Arrays.fill(x,-2);
        }
        int min =Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,recur(0,i,dp,matrix));
        }
        return min;



    }
    public int recur(int row, int col, int[][]dp, int[][]mat){
        if(col<0 || col>=mat.length)return (int)1e9;
        if(row==mat.length-1)return mat[row][col];
        if(dp[row][col]!=-2)return dp[row][col];
        int down=recur(row+1,col,dp,mat);
        int left=recur(row+1,col-1,dp,mat);
        int right=recur(row+1,col+1,dp,mat);
        return dp[row][col]=Math.min(down,Math.min(left,right))+mat[row][col];

    }
        
}