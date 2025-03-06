class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] main = new int[2];
        int[] ans = new int[n*n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(ans[grid[i][j]]==1){
                    main[0]=grid[i][j];
                }
                ans[grid[i][j]]++;
                
               
            }
        }
        for(int i=1;i<ans.length;i++){
            if(ans[i]==0){
                main[1]=i;
                break;
            }
        }
        return main; 


    }
}