class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] hash = new int[26];
        for(int i=0;i<t.length();i++){
            hash[t.charAt(i)-'a']=i;
        }
        int ans =0;
        for(int i=0;i<s.length();i++){
           ans+=Math.abs(hash[s.charAt(i)-'a']-i);
        }
        return ans;
    }
}