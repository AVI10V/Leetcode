class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n+1;i++){
            ans.add(new ArrayList<>());
        }
        for(int i=0;i<dislikes.length;i++){
            ans.get(dislikes[i][0]).add(dislikes[i][1]);
            ans.get(dislikes[i][1]).add(dislikes[i][0]);
        }
        int[] color= new int[n+1];
        Arrays.fill(color,-1);
        for(int i=1;i<n+1;i++){
            if(color[i]==-1){
                if(dfs(ans,color,i,0)==false)return false;

            }
        }
        return true;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int[] color, int i,int col){
        color[i]=col;
        for(int x:adj.get(i)){
            if(color[x]==-1){
                if(!dfs(adj,color,x,1-col))return false;
            }
            else if(color[x]==col)return false;
        }
        return true;
    }
}