class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int max =0;
        int curr=0;
        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<m;j++){
               if(mat[i][j]==1)count++;
            }
            if(count>max){
                curr=i;
                max=count;
            }
            
        }
        int[] ans = new int[2];
        ans[0]=curr;
        ans[1]=max;
        return ans;

    }
}