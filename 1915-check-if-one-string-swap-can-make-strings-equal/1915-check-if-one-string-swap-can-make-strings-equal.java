class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length())return false;
        int first=-1;
        int second=-1;
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                if(count==1){
                    first=i;
                    //first incorrect
                }
                else if(count==2){
                    second=i;
                }
                else{
                    return false;
                    //more than two incorrect spotted
                }
            }
        }
        if(count==0)return true;
        return count==2 && s1.charAt(first)==s2.charAt(second) && s2.charAt(first)==s1.charAt(second);
        
    }
}