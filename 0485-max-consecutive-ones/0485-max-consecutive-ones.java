class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                sum++;
            }
            else{
                sum=0;
            }
           if(sum>max){
            max=sum;
           }
        }
        return max;
        
        

    }
        
}