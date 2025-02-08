class Solution {
    public int maxDifference(String s) {
    int odd=Integer.MIN_VALUE;
    int even=Integer.MAX_VALUE;
    int[] freq= new int[26];
    for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
    boolean hasodd=false;
    boolean haseven=false;
    for(int x:freq){
        if(x>0){
            if(x%2==0){
                even=Math.min(even,x);
                haseven=true;
            }
            else{
                odd=Math.max(odd,x);
                hasodd=true;
            }
                
            
        }
       
    }
         if(!haseven || !hasodd)return 0;
        return odd-even;
        
    
    
        
        
    }
}