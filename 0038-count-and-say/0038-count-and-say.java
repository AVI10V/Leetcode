class Solution {
    public String countAndSay(int n) {
        if(n==1)return "1";
        String prev=countAndSay(n-1);
        return helper(prev);
    }
    public String helper(String ss){
        int n=ss.length();
        StringBuilder ans=new StringBuilder();
        int s=0;
        while(s<n){
           char curr=ss.charAt(s);
           int count=1;
           while(s+1<n && ss.charAt(s+1)==curr){
              count++;
              s++;
           }
           ans.append(count).append(curr);
           s++;
        }
        return ans.toString();

        
    }
}