class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int right=0;
        int left=0;
        while(right<s.length && left<g.length){
            if(g[left]<=s[right]){
                left++;
            }
        
            
            right++;
            
            


        }
        return left;
        
    }
}