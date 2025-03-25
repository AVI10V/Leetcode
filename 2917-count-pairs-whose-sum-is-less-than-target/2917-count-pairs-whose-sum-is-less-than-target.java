class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int s=0;
        int e=nums.size()-1;
        int ans =0;
        while(s<nums.size()){
            int sum =nums.get(s)+nums.get(e);
            if(s==e){
               break;
            }
            else if(sum<target){
                ans+=e-s;
                s++;
                e=nums.size()-1;
            }    
            else{
                e--;
            }

        }
        return ans;
    }
}