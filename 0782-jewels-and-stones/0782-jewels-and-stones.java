class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> st= new HashSet<>();
        int ans=0;
        for(int i=0;i<jewels.length();i++){
            st.add(jewels.charAt(i));
        }
        for(char ch:stones.toCharArray()){
          if(st.contains(ch))ans++;
        }
        return ans;
    }
}