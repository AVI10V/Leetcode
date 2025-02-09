class pair{
    int row;
    int col;
    int path;
    pair(int r, int c , int l){
        this.row=r;
        this.col=c;
        this.path=l;
    }
}

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        if(grid.length==1 && grid[0][0]==0)return 1;
        int len =0;
        Queue<pair> qu = new LinkedList<pair>();
        qu.offer(new pair(0,0,1));
        if(grid[0][0]==1)return -1;
        int[] drow={0,-1,-1,-1,0,1,1,1};
        int[] dcol={-1,-1,0,1,1,1,0,-1};
        while(!qu.isEmpty()){
            int row=qu.peek().row;
            int col=qu.peek().col;
            int ll=qu.peek().path;
            qu.remove();
            for(int i=0;i<8;i++){
                int nrow=row+drow[i];
                int ncol=col+dcol[i];
                if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<c  && grid[nrow][ncol]==0){
                    if(nrow==r-1 && ncol==c-1)return ll+1;
                    grid[nrow][ncol]=1;
                    qu.offer(new pair(nrow, ncol,ll+1));
                    
                }
            }

        }
    return -1;

        
    }
}