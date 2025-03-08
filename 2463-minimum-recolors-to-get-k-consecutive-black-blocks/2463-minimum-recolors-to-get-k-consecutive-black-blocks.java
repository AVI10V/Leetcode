class Solution {
    public int minimumRecolors(String blocks, int k) {
        int wcount = 0;
        int min=Integer.MAX_VALUE;
        int n=blocks.length();
        for(int i=0;i<k;i++){
           if(blocks.charAt(i)=='W')wcount++;
        }
        min=Math.min(wcount,min);
        if(n==k)return wcount;
        int i=0;
        int e=k-1;
        while(e<blocks.length()-1){
            if(blocks.charAt(i)=='W'){
                wcount--;
            }
            i++;
            if(blocks.charAt(++e)=='W')wcount++;
            min=Math.min(min,wcount);
        }
        return min;
    }
}