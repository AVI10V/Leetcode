class Solution {
    public char findKthBit(int n, int k) {
      int result=helper(n , k);
      return (char)(result+'0');
      
    }
    public int helper(int n ,int k){
        if(n==1)return 0;
       int half=(int)Math.pow(2,n-1)-1;
       if(k==half+1)return 1;
       if(k<=half){
         return helper(n-1, k);
       }
       else{
        return 1-helper(n-1 , (2*half+1)-k +1);
       }
    }
}