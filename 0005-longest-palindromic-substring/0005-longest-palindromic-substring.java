class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int max =0;
        String ans="" ;
        for(int i=0;i<n;i++){
            int j=n-1;
           while(j>=i){
              if(palind(s , i , j)){
                if(j-i+1 > max){
                max =j-i+1;
                ans=s.substring(i,j+1);
                }
                
              }
              j--;
           }
        }
        return ans;
    }
    public boolean palind(String s , int start , int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))return false;
            start++;
            end--;
        }
        return true;

    }
}