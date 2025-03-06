class Solution {
    public int scoreOfString(String s) {
        int ans =0;
        int i=0;
        while(i<s.length()-1){
            ans+=Math.abs(s.charAt(i)-s.charAt(i+1));
            i++;
        }
        return ans;

        
    }
}