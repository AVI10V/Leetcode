class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<e){
            if(nums[s]%2==1){
                while(s<e && nums[e]%2!=0){
                    e--;
                }
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                e--;
                s++;
            }
            else{
                s++;
            }
        }
        return nums;
    }
}