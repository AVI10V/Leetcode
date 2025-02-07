class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<Integer>());
        }
        for(int j=0;j<edges.length;j++){
            ans.get(edges[j][0]).add(edges[j][1]);
            ans.get(edges[j][1]).add(edges[j][0]);
        }
        boolean[] vis = new boolean[n];
        dfs(source,ans,vis);
        if(vis[destination])return true;
        return false;
    }
    public void dfs(int src,List<List<Integer>> ans,boolean[] vis){
        vis[src]=true;
        for(int x:ans.get(src)){
            if(!vis[x]){
                dfs(x,ans,vis);
            }
        }
    }
}