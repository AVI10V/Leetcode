class Solution {
    public int subtractProductAndSum(int n) {
        int x=1;
        int sum=0;
        while(n>0){
            int y=n%10;
            x*=y;
            sum+=y;
            n=n/10;
        }
        return x-sum;
    }
}