class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[][] dp = new int[n][n];
        for(int[] x:dp){
            Arrays.fill(x,-1);
        }
        return recur(triangle, dp ,0,0);
    }
    public int recur(List<List<Integer>> arr , int[][] dp , int r, int c){
        if(r==arr.size()-1)return arr.get(r).get(c);
        if(dp[r][c]!=-1)return dp[r][c];
        int down =arr.get(r).get(c)+recur(arr,dp,r+1,c);
        int right =arr.get(r).get(c)+recur(arr,dp,r+1,c+1);
        return dp[r][c]=Math.min(down,right);
    }
}