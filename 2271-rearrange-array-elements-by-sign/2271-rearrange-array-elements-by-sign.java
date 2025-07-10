class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len =nums.length;
        int[] ans = new int[len];
        int p=0;
        int n=1;
        for(int x:nums){
            if(x>0){
                ans[p]=x;
                p+=2;
            }
            else{
                ans[n]=x;
                n+=2;
            }
        }
        return ans;
    }
}