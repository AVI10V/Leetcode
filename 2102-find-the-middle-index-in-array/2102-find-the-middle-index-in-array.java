class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftsum=0;
        int rightsum=0;
        for(int i=nums.length-1;i>=1;i--){
            rightsum+=nums[i];
        }
        int p=0;
        while(p<nums.length){
            if(leftsum==rightsum)return p;
            leftsum+=nums[p];
            p++;
            if(p==nums.length)break;
            rightsum-=nums[p];

        }
        return -1;
    }
}