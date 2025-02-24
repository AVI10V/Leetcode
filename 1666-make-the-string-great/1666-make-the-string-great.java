class Solution {
    public String makeGood(String s) {
        StringBuilder ss= new StringBuilder();
        Stack<Character> st = new Stack<>();
        int i=s.length()-1;
        while(i>=0){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(st.peek().equals(s.charAt(i))){
                st.push(s.charAt(i));
            }
            else if(Character.toLowerCase(st.peek())==Character.toLowerCase(s.charAt(i))){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
            i--;

        }
        while(!st.isEmpty()){
            ss.append(st.pop());
        }
        return ss.toString();

    }
}