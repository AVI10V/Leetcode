class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int l=0;
        int sum=0;
        int maxsum=0;
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i])>=l){
                   while(l<=map.get(nums[i])){
                    sum-=nums[l];
                    l++;
                   } 
                }
            }
            sum+=nums[i];
            maxsum=Math.max(sum,maxsum);
            map.put(nums[i],i);

        }
        return maxsum;
    }
}