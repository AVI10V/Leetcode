class Solution {
    public String reverseWords(String s) {
        String[] ans = s.trim().split("\\s+");
        int start=0;
        int e=ans.length-1;
        while(start<e){
            String temp = ans[start];
            ans[start]=ans[e];
            ans[e]=temp;
            start++;
            e--;
        }
        return String.join(" ",ans);

    }
}