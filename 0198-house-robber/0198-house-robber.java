class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
        for(int i=1;i<n;i++){
            int pick=nums[i];
            int dont=dp[i-1];
            if(i>1){
                pick+=dp[i-2];
            }
            dp[i]=Math.max(pick,dont);
        }
        return dp[n-1];
    }
}