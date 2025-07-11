class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        if(k==n)return;
        int[] temp = new int[k];
        int ind=0;
        for(int i=n-k;i<n;i++){
          temp[ind]=nums[i];
          ind++;
        }
        for(int i=n-k-1;i>=0; i--){
            nums[i+k]=nums[i];
        }
        
        for(int i=0;i<k;i++){
            nums[i]=temp[i];
        }
    }
}