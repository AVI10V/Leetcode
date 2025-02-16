class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> adj = new ArrayList<>();
        if(n==1)return true;
        int r=dislikes.length;
        int c=dislikes[0].length;
        for(int i=0;i<n+1;i++){
              adj.add(new ArrayList<>());
        }
        for(int j=0;j<r;j++){
            adj.get(dislikes[j][0]).add(dislikes[j][1]);
            adj.get(dislikes[j][1]).add(dislikes[j][0]);
        }
        int[] color = new int[n+1];
        Arrays.fill(color,-1);
        for(int i=1;i<n;i++){
            if(color[i]==-1){
                if(!bfs(dislikes,i,color,0,adj))return false;
            }

        }
        return true;
    }
    public boolean bfs(int[][] dislikes, int node, int[] color, int col,List<List<Integer>> adj){
        color[node]=col;
        for(int x:adj.get(node)){
            if(color[x]==-1){
               if(!bfs(dislikes,x,color,1-col,adj))return false;
            }
            else if(color[x]==color[node])return false;
        }
        return true;
    }
}