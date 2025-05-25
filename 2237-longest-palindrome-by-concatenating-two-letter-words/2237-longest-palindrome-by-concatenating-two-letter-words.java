class Solution {
    public int longestPalindrome(String[] words) {
        Set<String> st= new HashSet<>();
        Map<String,Integer> map = new HashMap<>();
        int n=words.length;
        int ans =0;
        for(String str:words){
            String rev=""+str.charAt(1)+str.charAt(0);
            if(map.getOrDefault(rev,0)>0){
                ans+=4;
                map.put(rev,map.get(rev)-1);
            }
            else{
                map.put(str,map.getOrDefault(str,0)+1);
            }
        }
        for(String x:map.keySet()){
            if(x.charAt(0)==x.charAt(1) && map.get(x)>0){
                ans+=2;
                break;
            }
        }
        return ans;
  
    
    }
}