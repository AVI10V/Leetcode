class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       List<List<Integer>> ans = new ArrayList<>();
       ans.add(new ArrayList<>());
       ans.add(new ArrayList<>());
       Set<Integer> first= new HashSet<>();
       Set<Integer> second= new HashSet<>();
       for(int x:nums1)first.add(x);
       for(int x:nums2)second.add(x);
       for(int x:nums1){
        if(!second.contains(x)){
           ans.get(0).add(x);
           second.add(x);
        }
       }
       for(int x:nums2){
        if(!first.contains(x)){
            ans.get(1).add(x);
            first.add(x);
        }
       }
       return ans;

    }
}