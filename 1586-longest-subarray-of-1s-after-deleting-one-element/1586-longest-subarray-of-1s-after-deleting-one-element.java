class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;
        int r=0;
        int size=0;
        int c=0;
        while(r<nums.length){
            if(nums[r]==0){
                c++;
            }
            while(c>1){
                if(nums[l]==0){
                    c--;
                }
                l++;
            }
            size=Math.max(size,r-l); // since here we are removing that one element that is why we use r-l we are not including that one
            r++;
        }
        return size;
    }
}