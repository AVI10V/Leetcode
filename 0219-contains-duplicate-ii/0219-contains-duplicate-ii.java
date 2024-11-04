class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l=0;
        int r=0;
        HashMap <Integer, Integer> mpp = new HashMap<Integer, Integer>();
        while(r<nums.length){
            if(mpp.containsKey(nums[r])){
                if(r-mpp.get(nums[r])<=k)return true;
                

            }
            mpp.put(nums[r],r);
            r++;

        }
        return false;
        
    }
}