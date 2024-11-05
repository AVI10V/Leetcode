class Solution {
    public int numberOfSubstrings(String s) {
        int[] has={-1,-1,-1};
        int count=0;
        for(int i=0;i<s.length();i++){
            has[s.charAt(i)-'a']=i;
            if(has[0]!=-1 && has[1]!=-1 && has[2]!=-1){
                count+=1+Math.min((has[0]),Math.min(has[1],has[2]));
            }
        }
        return count;
        
    }
}