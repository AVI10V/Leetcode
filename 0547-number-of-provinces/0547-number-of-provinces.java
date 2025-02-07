class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int count=0;
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
           if(!vis[i]){
            count++;
            helper(i,vis,isConnected);
           }
        }
        return count;    
    }
    public void helper(int node, boolean[] vis,int[][] isConnected){
       Queue<Integer> qu = new LinkedList<>();
       qu.offer(node);
       vis[node]=true;
       while(!qu.isEmpty()){
        int curr=qu.poll();
        for(int i=0;i<isConnected[curr].length;i++){
            if(isConnected[curr][i]==1 && !vis[i]){
                qu.offer(i);
                vis[i]=true;
            }

        }
       }

    }
}