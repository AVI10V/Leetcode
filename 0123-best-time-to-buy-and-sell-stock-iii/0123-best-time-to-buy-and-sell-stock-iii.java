class Solution {
    public int maxProfit(int[] prices) {
        int n =prices.length;
        int[][] dp = new int[2][3];
        for(int ind=n-1;ind>=0;ind--){
            int[][] curr = new int[2][3];
            for(int buy=0;buy<2;buy++){
              for(int trans=2;trans>0;trans--){
                int profit=0;
                if(buy==1){
            profit=Math.max(-prices[ind]+dp[0][trans],dp[1][trans]);
        }
        else{
            profit=Math.max(+prices[ind]+dp[1][trans-1],dp[0][trans]);
            }
            curr[buy][trans]=profit;
             
                }
            }
            dp=curr;
        }
        return dp[1][2];

       


        

    }
    
}