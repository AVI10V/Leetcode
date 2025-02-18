class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> sol= new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n=graph.length;
        for(int i=0;i<n;i++){
             ans.add(new ArrayList<>());
        }
        int[] indeg= new int[n];
        for(int i=0;i<n;i++){
            for(int x:graph[i]){
                ans.get(x).add(i);
                indeg[i]++;
            }
        }
        Queue<Integer> qu = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indeg[i]==0){
                qu.offer(i);
            }
        }
        while(!qu.isEmpty()){
            int node = qu.poll();
            sol.add(node);
            for(int x:ans.get(node)){
                indeg[x]--;
                if(indeg[x]==0){
                    qu.offer(x);
                }
            }
            

        }
        Collections.sort(sol);
        return sol;

        
    }
}