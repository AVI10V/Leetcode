class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int r=k;
        double sum=0;
        double max=0;
        for(int i=0;i<k;i++){
           sum+=(double)nums[i];
        }
        max=sum;
        while(r<nums.length){
            sum-=nums[l];
            sum+=nums[r];
            max=Math.max(max,sum);
            l++;
            r++;

        }
        return (double)max/k;
        
    }
}