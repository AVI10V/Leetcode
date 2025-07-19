class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        int i=0;
        int sign =1;
        while(i<n && Character.isWhitespace(s.charAt(i))){
            i++;
        }
        if(i==n)return 0;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+'){
            sign=1;
            i++;
        }
        long ans =0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int curr=s.charAt(i)-'0';
            ans=ans*10+curr;
            if(sign <0 && sign*ans < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            else if(sign>0 && sign*ans > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            i++;

        }
        return (int)(ans*sign);
        
    }
}