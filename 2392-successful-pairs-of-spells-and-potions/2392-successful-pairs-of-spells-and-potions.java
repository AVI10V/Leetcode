class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length;
        int m=potions.length;
        int[] ans = new int[n];
        Arrays.sort(potions);
        int thresh;
        for(int i=0;i<n;i++){
            thresh = (int)Math.ceil((double)success / spells[i]);
            ans[i]=m-bs(thresh , potions);
        }    
        return ans;

     
    }
    public int bs(int t , int[] arr){
        int s=0;
        int e=arr.length-1;
        
        while(s<=e){
         int m=s+(e-s)/2;
         if(arr[m]>=t){
            e=m-1;
         }
         else{
            s=m+1;
         }
        }
        return s;
    }
}