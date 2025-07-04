class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        while(sb.length()<(k)){
            int n=sb.length();
            StringBuilder temp = new StringBuilder();
            for(int i=0;i<n;i++){
                char c=sb.charAt(i);
                char next=(char)('a'+(c-'a'+1)%26);
                temp.append(next);
            }
            sb.append(temp);
        }
       
        return sb.charAt(k-1);

    }
}