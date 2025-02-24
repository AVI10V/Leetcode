class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int i=s.length()-1;
        while(i>=0){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(st.peek()==(s.charAt(i))){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
            i--;

        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}