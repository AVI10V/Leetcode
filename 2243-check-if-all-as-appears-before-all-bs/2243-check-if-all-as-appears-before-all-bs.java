class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        int start=0;
        int end =s.length()-1;
        while(start<n){
            if(s.charAt(start)=='a'){
                start++;
            }
            else{
                break;
            }
        }
        while(end>=0){
           if(s.charAt(end)=='b'){
            end--;
           }
           else{
            break;
           }
        }
        if(start>end)return true;
        return false;
    }
}