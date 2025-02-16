//USING BFS


class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] color= new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                Queue<Integer> qu = new LinkedList<>();
                qu.offer(i);
                color[i]=0;
                while(!qu.isEmpty()){
                    int node = qu.poll();
                    for(int x:graph[node]){
                        if(color[x]==-1){
                            qu.offer(x);
                            color[x]=1-color[node];
                        }
                        else if(color[x]==color[node])return false;
                    }
                }
                
            }
            
        }
        return true;

        
    }
}