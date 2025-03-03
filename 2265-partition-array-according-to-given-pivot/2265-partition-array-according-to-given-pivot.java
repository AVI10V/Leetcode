class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int[] ans = new int[nums.length];
        int x=0;
        int e=n-1;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                ans[x]=nums[i];
                x++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                ans[x]=pivot;
                x++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                ans[x]=nums[i];
                x++;
            }
        }
        return ans;
    }
}