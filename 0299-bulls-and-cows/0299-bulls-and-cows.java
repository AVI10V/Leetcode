class Solution {
    public String getHint(String secret, String guess) {
     Map<Character,Integer> map = new HashMap<>();
     int n=secret.length();
     for(int i=0;i<n;i++){
        char c=secret.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
     }
     int x=0;
     int y=0;
     for(int i=0;i<n;i++){
        if(guess.charAt(i)==secret.charAt(i)){
            x++;
            map.put(secret.charAt(i),map.get(secret.charAt(i))-1);
        }
     }
     for(int i=0;i<n;i++){
         if(secret.charAt(i)!=guess.charAt(i)){
            char c=guess.charAt(i);
            if(map.containsKey(c) && map.get(c)!=0){
                y++;
                map.put(c,map.get(c)-1);
            }
        }
     }
     StringBuilder ans =new StringBuilder();
     ans.append(x);
     ans.append('A');
     ans.append(y);
     ans.append('B');
     return ans.toString();

    }
}