class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] color=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(!bfs(graph,i,color,0))return false;
            }

        }
        return true;
        
    }
    public boolean bfs(int[][] graph,int node, int[] color, int col){
        color[node]=col;
        for(int x:graph[node]){
                if(color[x]==-1){
                    if(!bfs(graph,x,color,1-col))return false;
                }
                else if(color[x]==color[node])return false;
        }
        return true;
    }
}