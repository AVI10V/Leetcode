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
                    bfs(new pair(i,j),grid);
                }
            }
        }
        return ans; 
    }
    class pair{
        int row;
        int col;
        public pair(int x, int y){
            this.row=x;
            this.col=y;
        }
    }
    public boolean isvalid(int r, int c, char[][] mat){
        if(r<0|| r>=mat.length|| c<0 || c>=mat[0].length )return false;
        return true;
    }
    public void bfs(pair p , char[][] grid){
        Queue<pair> qu = new LinkedList<pair>();
        qu.offer(p);
        int r=p.row;
        int c=p.col;
        grid[r][c]='0';
        int[] drow={0,-1,0,+1};
        int[] dcol={-1,0,+1,0};
        while(!qu.isEmpty()){
            pair pp= qu.poll();
            int curr=pp.row;
            int curc=pp.col;
            for(int i=0;i<4;i++){
                int nrow=curr+drow[i];
                int ncol=curc+dcol[i];
                if(isvalid(nrow,ncol,grid) && grid[nrow][ncol]=='1'){
                    grid[nrow][ncol]='0';
                    qu.offer(new pair(nrow,ncol));

                }
            }

        }
        
        

    }
}