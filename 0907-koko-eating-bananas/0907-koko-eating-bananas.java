class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s=1;
        int max=Integer.MIN_VALUE;
        for(int x:piles){
            max=Math.max(x,max);
        }
        int e=max;
        int ans =-1;
        while(s<e){
            int m=s+(e-s)/2;
            int time=func(m , piles);
            if(time<=h){
                ans=m;
                e=m;
            }
            else{
                s=m+1;
            }
        }
        return s;

    }
    public int func(int s , int[] arr){
        int ans =0;
        for(int x:arr){
            ans+=(int)Math.ceil((double)x/s);
        }
        return ans;
    }
}