class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return sub(nums,k)-sub(nums,k-1);
    }
    private int sub(int[] nums, int k){
        int l=0;
        int r=0;
        int count=0;
        int nos=0;
        while(r<nums.length){
            if(nums[r]%2==1){
                count++;
            }
            while(count>k){
                if(nums[l]%2==1){
                    count--;
                }
                l++;
            }
            nos+=r-l+1;
            r++;

        }
        return nos;
    }
}