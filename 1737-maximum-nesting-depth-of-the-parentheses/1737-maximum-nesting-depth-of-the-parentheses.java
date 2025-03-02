class Solution {
    public int maxDepth(String s) {
        int n= s.length();
        Stack<Character> st = new Stack<>();
        int max =0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }
            else if(s.charAt(i)==')'){
                st.pop();
            }
            max=Math.max(max,st.size());

        }
        return max;

    }
}