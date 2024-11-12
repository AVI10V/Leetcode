class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int l=0;
        int r=0;
        while(r<typed.length()){
            if(l<name.length() && name.charAt(l)==typed.charAt(r)){
                l++;
                r++;
            }
            else if(r>0 && typed.charAt(r)==typed.charAt(r-1)){
                r++;
            }
            else{
                return false;
            }
        }
        if(l==name.length())return true;
        return false;
    }    
   
}