class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        int count =0;
        int l=0;
        for(int r=1;r<n+k-1;r++){
          if(colors[r%n]==colors[(r-1)%n]){
            l=r;
          }
          if((r-l+1)>k){
            l=l+1;
          }
          if(r-l+1==k){
            count++;
          }
        }
        return count ;
    }
}