class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> st = new HashSet<>();
        int n= s.length();
       int i=0;
       int e=n-1;
       while(i<=e){
        st.add(s.charAt(i));
        st.add(s.charAt(e));
        i++;
        e--;
       }
       return st.size();

    }
}