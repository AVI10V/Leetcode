class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int max=0;
        int balance=0;
        for(int i=0;i<n;i++){
           if(s.charAt(i)=='('){
            balance++;
           }
           else if(s.charAt(i)==')'){
            balance--;
           }
           max=Math.max(max , balance);
        }
        return max;
        
    }
}