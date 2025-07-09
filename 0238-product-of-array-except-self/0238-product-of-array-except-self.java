class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] pre = new int[n];
        int[] post = new int[n];
        int prod=nums[0];
        pre[0]=1;
        for(int i=1;i<n;i++){
            pre[i]=prod;
            prod*=nums[i];
        }
        prod=nums[n-1];
        post[n-1]=1;
        for(int i=n-2;i>=0;i--){
            post[i]=prod;
            prod*=nums[i];
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=pre[i]*post[i];
        }
        return ans;
    }
}