class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        String s1=event1[0];
        String s2=event2[0];
        String e1=event1[1];
        String e2=event2[1];

        return e2.compareTo(s1)>=0 && e1.compareTo(s2)>=0;

        
        
    }
}