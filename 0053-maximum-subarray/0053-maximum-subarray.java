class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int curr=0;
        int sum=0;
        for(int x:nums){
            curr=Math.max(x , curr+x);
            max=Math.max(max , curr);
        }
        return max;
    }
}