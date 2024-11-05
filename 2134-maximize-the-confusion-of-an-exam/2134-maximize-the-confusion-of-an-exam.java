class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        int l=0;
        int r=0;
        int maxfreq=0;
        int len=0;
        int[] ans=new int[2];
        while(r<s.length()){
            if(s.charAt(r)=='T'){
                ans[0]++;
                maxfreq=Math.max(maxfreq,ans[0]);
            }
            else{
                ans[1]++;
                maxfreq=Math.max(maxfreq,ans[1]);
            }
            while(r-l+1-maxfreq>k){
                if(s.charAt(l)=='T'){
                    ans[0]--;
                }
                else{
                    ans[1]--;
                }
                l++;
            }
            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
       
    }
}