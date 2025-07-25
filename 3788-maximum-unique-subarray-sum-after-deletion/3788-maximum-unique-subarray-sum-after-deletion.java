class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        int sum=0;
        Arrays.sort(nums);
        int i=nums.length-1;
        if(nums[i]<0)return nums[i];
        while(i>=0 && nums[i]>0){
            if(!ans.contains(nums[i])){
                sum+=nums[i];
                ans.add(nums[i]);
            }
            i--;
        }
        return sum;
    }
}