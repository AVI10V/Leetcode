class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][]dp = new int[m][n];
        if(m==1 && n==1 && obstacleGrid[0][0]==1)return 0;
        if(m==1 && n==1 && obstacleGrid[0][0]==0)return 1;
        for(int[] x:dp){
            Arrays.fill(x,-1);
        }
        return recur(obstacleGrid,dp,m-1,n-1);
    }
    public int recur(int[][] grid, int[][] dp, int r, int c){
        if(r==0 && c==0 && grid[r][c]==0)return 1;
        if(r<0 || c<0)return 0;
        if(grid[r][c]==1)return 0;
        if(dp[r][c]!=-1)return dp[r][c];
        int up=recur(grid,dp,r-1,c);
        int left=recur(grid,dp,r,c-1);
        return dp[r][c]=left+up;
    }
}