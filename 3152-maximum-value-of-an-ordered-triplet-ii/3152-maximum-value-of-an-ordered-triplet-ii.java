class Solution {
    public long maximumTripletValue(int[] nums) {
        int prefix=nums[0];
        int max=0;
        long ans =0;
        for(int i=1;i<nums.length;i++){
           ans =(long)Math.max(ans,(long)max*nums[i]);
            prefix=Math.max(prefix,nums[i]);
            max=Math.max(max,prefix-nums[i]);
           
        }
        return ans;
    }

}