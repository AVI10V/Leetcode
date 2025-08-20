class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        recur(ans , nums , 0 , new ArrayList<>());
        return ans;
    }
    public void recur(List<List<Integer>> ans , int[] nums , int ind , List<Integer> ds){
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1])continue;
            ds.add(nums[i]);
            recur(ans , nums , i+1 , ds);
            ds.remove(ds.size()-1);
            
        }
    }
}