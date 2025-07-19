class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        int e=arr.length-1;
        StringBuilder sb = new StringBuilder();
        while(e>=0){
            sb.append(arr[e]);
            e--;
            if(e<0)break;
            sb.append(" ");
        }
        return sb.toString();
        
    }
}