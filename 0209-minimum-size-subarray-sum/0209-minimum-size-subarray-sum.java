class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int len=Integer.MAX_VALUE;
        int sum=0;
        while(r<nums.length){
            while(sum<target && r<nums.length){
                sum+=nums[r];
                r++;
            }
            while(sum>=target){
                len=Math.min(len,r-l);
                sum-=nums[l];
                l++;
            }
            
        }
        if(len==Integer.MAX_VALUE)return 0;
        return len;
        
    }
}