class Solution {
    public int[] singleNumber(int[] nums) {
        int s=0;
        int count=0;
        int[] ans = new int[2];
        Arrays.sort(nums);
        while(s<nums.length){
            if(s<nums.length-1 && nums[s]==nums[s+1]){
                s=s+2;
            }
            else if(s==nums.length-1 || (s<nums.length-1 && nums[s]!=nums[s+1])){
                if(s==nums.length-1 && count==1){
                    ans[1]=nums[s];
                }
                else if(count==0){
                    ans[0]=nums[s];
                    count++;
                }
                else if(count==1){
                    ans[1]=nums[s];
                }
                s++;
            }

            
        }
        return ans;
    }
}