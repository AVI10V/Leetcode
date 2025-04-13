class Solution {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int ans =0;
        if(nums.length==1)return nums[0];
        while(i<nums.length){
             if(i==nums.length-1){
                if(nums[i]!=nums[i-1]){
                    ans+=nums[i];
                }
                break;
             }
              else if(nums[i]==nums[i+1]){
                int x=nums[i];
                while(i<nums.length && nums[i]==x){
                    i++;
                }
            }
            else{
                ans+=nums[i];
                i++;
            }
        }
        return ans;
    }
}