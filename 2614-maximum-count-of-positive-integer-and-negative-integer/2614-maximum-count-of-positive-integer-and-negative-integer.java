class Solution {
    public int maximumCount(int[] nums) {
        int pos=0;
        int neg=0;
        for(int x:nums){
            if(x<0)neg++;
            else if(x>0)pos++;
        }
        return Math.max(neg,pos);
    }
}