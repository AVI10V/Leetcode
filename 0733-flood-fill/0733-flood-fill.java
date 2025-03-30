
//USNIG BFS 
class Solution {
   class pair{
    int row;
    int col;
    public pair(int x, int y){
        this.row=x;
        this.col=y;
    }
   }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orignal=image[sr][sc];
        if(orignal==color)return image;
        bfs(orignal,new pair(sr,sc),color,image);
        return image;
    }
    public void bfs(int oc,pair pp, int color,int[][] image){
        int orow=pp.row;
        int ocol=pp.col;
        image[orow][ocol]=color;
        int[] drow={0,-1,0,+1};
        int[] dcol={-1,0,1,0};
        Queue<pair> qu = new LinkedList<>();
        qu.offer(pp);
        while(!qu.isEmpty()){
            pair p=qu.poll();
            int row=p.row;
            int col=p.col;
            for(int i=0;i<4;i++){
                int nrow=row+drow[i];
                int ncol=col+dcol[i];
                if(nrow>=0 && nrow<image.length && ncol>=0 && ncol<image[0].length && image[nrow][ncol]==oc){
                    qu.offer(new pair(nrow,ncol));
                    image[nrow][ncol]=color;
                }
            }

        }

    }
}