class Solution {
    public String removeOuterParentheses(String s) {
        int balance =0;
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c:ch){
            if(c=='('){
                if(balance > 0){
                   sb.append('(');
                }
                balance++;
            }
            else{
                balance--;
                if(balance>0){
                    sb.append(')');
                }
                
            }
        }
        return sb.toString();
    }
}