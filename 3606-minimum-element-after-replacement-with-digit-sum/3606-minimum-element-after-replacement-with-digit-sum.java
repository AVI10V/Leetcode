class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
           int calc=func(nums[i]);
           min=Math.min(min,calc);
        }
        return min;
    }
    public int func(int n){
        int ans =0;
        while(n>0){
            ans+=n%10;
            n=n/10;
        }
        return ans;
    }
}