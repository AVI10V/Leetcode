class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        int j=n-1;
        if(i>=0){
            while(j>i && nums[j]<=nums[i]){
                j--;
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

            // now reverse i+1th to end
            int e=n-1;
            int s=i+1;
            while(s<e){
                int t=nums[s];
                nums[s]=nums[e];
                nums[e]=t;
                s++;
                e--;
            }
        }
        else{
            Arrays.sort(nums);
        }

    }
}