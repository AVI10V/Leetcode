class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int calculate=0;
        for(int x:nums){
            calculate+=x;
        }
        return sum-calculate;
    }
}