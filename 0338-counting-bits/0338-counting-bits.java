class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<n+1;i++){
            ans[i]=helper(i);
        }
        return ans;
    }
    public int helper(int n){
        int ans=0;
        while(n!=0){
            n=(n&(n-1));
            ans++;

        }
        return ans;
    }
}