class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int n=nums.length;
        List<Boolean> ans = new ArrayList<>();
        int curr=0;
        for(int x:nums){
            curr=(curr*2+x)%5;
            ans.add(curr==0);
        }
        return ans;
    }
}