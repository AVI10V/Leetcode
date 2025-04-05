class Solution {
    class pair{
        int node;
        int weight;
        public pair(int x, int y){
            this.node=x;
            this.weight=y;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] dis= new int[n+1];
        Arrays.fill(dis,(int)(1e9));
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for(int i=0;i<n+1;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<times.length;i++){
           adj.get(times[i][0]).add(new pair(times[i][1],times[i][2]));
        }
        PriorityQueue<pair> qu = new PriorityQueue<>((a,b)->a.weight-b.weight);
        dis[k]=0;
        qu.offer(new pair(k,0));
        while(!qu.isEmpty()){
            pair p=qu.poll();
            int currnode=p.node;
            int currweight=p.weight;
            for(int i=0;i<adj.get(currnode).size();i++){
                int edgeweight=adj.get(currnode).get(i).weight;
                int neigh=adj.get(currnode).get(i).node;
                if(dis[neigh]>currweight+edgeweight){
                    dis[neigh]=currweight+edgeweight;
                    qu.offer(new pair(neigh,currweight+edgeweight));
                }
            }


        }
        int max =-1;
        for(int i=1;i<dis.length;i++){
            max=Math.max(max,dis[i]);
        }
        return max!=(int)(1e9)?max:-1;
    }
}