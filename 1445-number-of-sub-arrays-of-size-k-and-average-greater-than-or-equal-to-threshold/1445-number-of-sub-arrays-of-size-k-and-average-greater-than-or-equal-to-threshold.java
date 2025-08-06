class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans =0;
        int sum=0;
        int n=arr.length;
        int req=threshold*k;
        for(int i=0;i<k;i++)sum+=arr[i];
        if(sum>=req)ans++;
        for(int i=k;i<n;i++){
            sum-=arr[i-k];
            sum+=arr[i];
            if(sum>=req)ans++;

        }
        return ans;
    }
}