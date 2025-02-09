class pair{
    int row;
    int col;
    int tm;
     pair(int r, int c ,int t){
        this.row=r;
        this.col=c;
        this.tm=t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int count =0;
        int m=grid.length;
        int n=grid[0].length;
        int vis[][]= new int[m][n];
        Queue<pair> qu = new LinkedList<pair>();
        int freshcnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                  qu.offer(new pair(i,j,0));
                  vis[i][j]=2;
                }
                else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1)freshcnt++;
            }
        }
        int[] drow={0,-1,0,+1};
        int[] dcol={-1,0,1,0};
        int time=0;
        int cnt=0;
        while(!qu.isEmpty()){
            pair p=qu.poll();
            int r=p.row;
            int c=p.col;
            int t=p.tm;
            time=t;
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && grid[nrow][ncol]==1 && vis[nrow][ncol]==0){
                    qu.offer(new pair(nrow, ncol ,t+1));
                    vis[nrow][ncol]=2;
                    cnt++;
                }
            }
            

        }
        if(cnt!=freshcnt)return -1;
        return time;

        
        
    }
}