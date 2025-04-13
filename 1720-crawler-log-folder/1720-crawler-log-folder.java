class Solution {
    public int minOperations(String[] logs) {
        int curr=0;
        for(String x:logs){
            if(x.equals("../")){
                if(curr==0)continue;
                else{
                    curr--;
                }
            }
            else if(x.equals("./")){
                continue;
            }
            else{
               curr++;
            }
        }
        return Math.abs(curr);
    }
}