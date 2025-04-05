class Solution {
     int ans=0;
    public int subsetXORSum(int[] nums) {
        recur(nums, 0 , 0);
        return ans;
    }
    public void recur(int[] nums , int curr, int i){
        if(i==nums.length){
            ans+=curr;
            return;
        }
        recur(nums,curr^nums[i],i+1);
        recur(nums,curr,i+1);
        
    }
}