class Solution {
    public int majorityElement(int[] nums) {
        int element =0;
        int curr=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
          if(curr==0){
            element=nums[i];
            curr++;
          }
          else if(nums[i]==element){
            curr++;
          }
          else{
            curr--;
          }
        }
        return element;
        



    }
}
                
  