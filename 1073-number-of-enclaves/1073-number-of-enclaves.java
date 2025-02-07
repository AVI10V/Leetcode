class Solution {
    class pair{
        int row;
        int col;
        public pair(int x, int y){
            this.row=x;
            this.col=y;
        }
    }
    public boolean isvalid(int r, int c, int[][] mat){
        if(r<0||r>=mat.length||c<0||c>=mat[0].length)return false;
        return true;
    }
    public int numEnclaves(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int ans=0;
        Queue<pair> qu = new LinkedList<pair>();
        for(int i=0;i<r;i++){
            if(grid[i][0]==1)qu.offer(new pair(i,0));
            if(grid[i][c-1]==1)qu.offer(new pair(i,c-1));
        }
        for(int j=0;j<c;j++){
            if(grid[0][j]==1)qu.offer(new pair(0,j));
            if(grid[r-1][j]==1)qu.offer(new pair(r-1,j));
        }
        int[] drow={0,-1,0,+1};
        int[] dcol={-1,0,+1,0};
        while(!qu.isEmpty()){
            pair p=qu.poll();
            int curr=p.row;
            int curc=p.col;
            if(grid[curr][curc]==0)continue;
            grid[curr][curc]=0;
            for(int q=0;q<4;q++){
                int newr=curr+drow[q];
                int newc=curc+dcol[q];
                if(isvalid(newr,newc,grid) && grid[newr][newc]!=0){
                    qu.offer(new pair(newr,newc));
                }
            }

        }
        for(int k=0;k<r;k++){
            for(int l=0;l<c;l++){
                if(grid[k][l]==1)ans++;
            }
        }
        return ans;

        
    }
}