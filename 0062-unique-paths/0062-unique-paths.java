class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] x:dp){
            Arrays.fill(x,-1);
        }
        return recur(m-1,n-1,dp);
    }
    public int recur(int r, int c, int[][]dp){
        if(r==0 && c==0)return 1;
        if(r<0 || c<0)return 0;
        if(dp[r][c]!=-1)return dp[r][c];
        int up=recur(r-1,c,dp);
        int left=recur(r,c-1,dp);
        return dp[r][c]=up+left;
    }
}