class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        int ans = 0;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] vis = new int[n];
        int[] outdeg= new int[n];
        for(int i=0;i<edges.length;i++){
           adj.get(edges[i][0]).add(edges[i][1]);
           adj.get(edges[i][1]).add(edges[i][0]);
           outdeg[edges[i][0]]++;
           outdeg[edges[i][1]]++;
        }
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                if(bfs(i,vis,adj,outdeg)){
                    ans++;
                }
                
            }
        }
        return ans;


    }
    public boolean bfs(int node ,int[] vis, List<List<Integer>> adj,int[] outdeg){
        Queue<Integer> qu = new LinkedList<>();
        Queue<Integer> main = new LinkedList<>();
        qu.offer(node);
        main.offer(node);
        vis[node]=1;
        int nodes =1;
        while(!qu.isEmpty()){
            int curr= qu.poll();
            for(int x:adj.get(curr)){
                if(vis[x]==0){
                    vis[x]=1;
                    qu.offer(x);
                    main.offer(x);
                    nodes++;
                }
               
            }
        }
        while(!main.isEmpty()){
            int now =main.poll();
            if(outdeg[now]!=nodes-1)return false;
        }
        return true;
    }
}