class Solution {
    public String minWindow(String s, String t) {
        int minl=Integer.MAX_VALUE;
        int l=0;
        int r=0;
        int si=-1;
        int cut=0;
        int n=t.length();
        int[] hash=new int[256];
        for(int i=0;i<t.length();i++){
            hash[t.charAt(i)]++;
        }
        while(r<s.length()){
            if(hash[s.charAt(r)]>0){
                cut++;
            }
            hash[s.charAt(r)]--;
            while(cut==n){
                if(r-l+1<minl){
                    minl=r-l+1;
                    si=l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0){
                    cut--;
                }
                l++;
            }
            r++;
        } 
        return si==-1? "":s.substring(si,si+minl);
    }

}