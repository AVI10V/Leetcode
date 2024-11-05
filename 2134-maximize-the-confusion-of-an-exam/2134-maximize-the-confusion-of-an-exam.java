class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        return Math.max(con(s,k,'T'),con(s,k,'F'));

        
    }
    private int con(String s, int k, char t){
        int l=0;
        int r=0;
        int len =0;
        int count=0;
        while(r<s.length()){
            if(s.charAt(r)!=t){
                count++;
            }
            while(count>k){
                if(s.charAt(l)!=t){
                    count--;
                }
                l++;
            }
            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
    }
}