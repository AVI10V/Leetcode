//USING DFS

class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0)return 0;
        int ans =0;
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j] == '1'){
                    ans++;
                    dfs(i,j,grid);
                }
            }
        }
        return ans; 
    }
    public void dfs(int r, int c, char[][] grid){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]=='0')return;

        grid[r][c]='0';
        dfs(r-1,c,grid);
        dfs(r+1,c,grid);
        dfs(r,c-1,grid);
        dfs(r,c+1,grid);

    }
}