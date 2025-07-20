class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(nums[0],0);
        int[] ans = new int[2];
        int n=nums.length;
        for(int i=1;i<n;i++){
          int val=target-nums[i];
          if(map.containsKey(val)){
            ans[0]=map.get(val);
            ans[1]=i;
            break;
          }
          else{
            map.put(nums[i],i);
          }
        }
        return ans;
    }
}