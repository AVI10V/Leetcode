class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        if(n<4)return ans;
        for(int i=0;i<n-3;i++){
            int curr1=nums[i];
            for(int j=i+1;j<n-2;j++){
                int curr2=nums[j];
                int k=j+1;
                int l=n-1;
                while(k<l){
                   long sum=(long)curr1+curr2+nums[k]+nums[l];
                   if(sum==target){
                    set.add(Arrays.asList(curr1 ,curr2 ,nums[k] , nums[l]));
                    k++;
                    l--;
                   }
                   else if(sum<target){
                    k++;
                   }
                   else{
                    l--;
                   }
                }
            }
        }
        ans.addAll(set);
        return ans;

    }
}