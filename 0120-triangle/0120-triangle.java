class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[] dp = new int[n];
        for(int i=0;i<triangle.get(n-1).size();i++){
            dp[i]=triangle.get(n-1).get(i);
        }
        for(int i=n-2;i>=0;i--){
            int[] temp = new int[n];
            for(int j=0;j<triangle.get(i).size();j++){
                int up=dp[j];
                int left=dp[j+1];
                temp[j]=Math.min(up,left)+triangle.get(i).get(j);
            }
            dp=temp;
        }
        return dp[0];

    }
}