class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        int n=s.length();
        int i=0;
        while(i<n){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)=='B' && st.peek()=='A'){
                st.pop();
            }
            else if(s.charAt(i)=='D' && st.peek()=='C'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
            i++;
        }
        return st.size();
        
    }
}