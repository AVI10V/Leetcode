class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recur(nums , 0 , ans ,new ArrayList<>());
        return ans;
    }
    public void recur(int[] nums , int ind , List<List<Integer>> ans , List<Integer> temp){
        if(ind==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[ind]);
        recur(nums , ind+1 , ans , temp);
        temp.remove(temp.size()-1);
        recur(nums , ind+1 , ans , temp);
    }
}