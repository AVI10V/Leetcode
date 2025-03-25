class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int s=0;
        int e=nums.size()-1;
        int ans =0;
        while(s<e){
            int sum =nums.get(s)+nums.get(e);
            if(sum<target){
                ans+=e-s;
                s++;
            }    
            else{
                e--;
            }

        }
        return ans;
    }
}