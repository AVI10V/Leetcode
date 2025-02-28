class Solution {
    public String reverseVowels(String s) {
        Set<Character> st = new HashSet<>();
        st.add('a');
        st.add('e');
        st.add('i');
        st.add('o');
        st.add('u');
        st.add('A');
        st.add('E');
        st.add('I');
        st.add('O');
        st.add('U');
        int start=0;
        int e=s.length()-1;
        char[] ch = s.toCharArray();
        while(start<e){
           if(st.contains(ch[start])){
            while(start<e && !st.contains(ch[e])){
                e--;
            }
            char temp=ch[start];
            ch[start]=ch[e];
            ch[e]=temp;
            e--;

           }
           start++;
        }
        return new String(ch);
    }
}