class Solution {
    public int maxAscendingSum(int[] nums) {
        int s=0;
        int e=1;
        int sum=nums[0];
        int ans=Integer.MIN_VALUE;
        if(nums.length==1)return nums[0];
        while(s<nums.length && e<nums.length){
        if(nums[s]>=nums[e] && e<nums.length && s<nums.length){
            ans=Math.max(ans,sum);
            sum=nums[e];
            s=e;
            e=e+1;
        }
        else{
            sum+=nums[e];
            s=s+1;
            e=e+1;
        }

          
        }
        ans=Math.max(ans,sum);
        return ans;
    }
}