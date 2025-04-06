class Solution {
    class pair{
        int row;
        int col;
        int effort;
        public pair(int x, int y, int z){
          this.row=x;
          this.col=y;
          this.effort=z;
        }

    }
    public int minimumEffortPath(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        int[][] dis= new int[m][n];
        for(int[] x:dis){
            Arrays.fill(x,Integer.MAX_VALUE);
        }
        dis[0][0]=0;
        PriorityQueue<pair> qu = new PriorityQueue<>((a,b)->a.effort-b.effort);
        qu.offer(new pair(0,0,0));
        while(!qu.isEmpty()){
            pair p=qu.poll();
            int r=p.row;
            int c=p.col;
            int effort=p.effort;
            if(r==m-1 && c==n-1)return effort;
            int[] drow={0,-1,0,1};
            int[] dcol={-1,0,1,0};
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n){
                    int nexteffort=Math.max(effort,Math.abs(heights[nrow][ncol]-heights[r][c]));
                    if(dis[nrow][ncol]>nexteffort){
                        dis[nrow][ncol]=nexteffort;
                        qu.offer(new pair(nrow,ncol,nexteffort));
                    }

                }
            }
        }
        return -1;
    }
}