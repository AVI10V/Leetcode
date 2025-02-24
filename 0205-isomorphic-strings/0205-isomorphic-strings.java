class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Integer> maps= new HashMap<>();
        Map<Character,Integer> mapt= new HashMap<>();
        int i=0;
        while(i<s.length()){
           if(!maps.containsKey(s.charAt(i))){
            maps.put(s.charAt(i),i);
           } 
           if(!mapt.containsKey(t.charAt(i))){
            mapt.put(t.charAt(i),i);
           }
           if(!maps.get(s.charAt(i)).equals(mapt.get(t.charAt(i))))return false;
           
           i++;
        }
        return true;
    }
}