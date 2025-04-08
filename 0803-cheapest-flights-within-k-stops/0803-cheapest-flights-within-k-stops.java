class Solution {
    class pair{
        int node;
        int cost;
        int stop;
        public pair(int x, int y, int z){
            this.node=x;
            this.cost=y;
            this.stop=z;
        }
        public pair(int x, int y){
            this.node=x;
            this.cost=y;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<flights.length;i++){
            adj.get(flights[i][0]).add(new pair(flights[i][1],flights[i][2]));
        }
        int[] cost = new int[n];
        Arrays.fill(cost,(int)(1e9));
        cost[src]=0;
        Queue<pair> qu =new LinkedList<>();
        qu.offer(new pair(src,0,0));
        while(!qu.isEmpty()){
            pair p=qu.poll();
            int currcost=p.cost;
            int currstops=p.stop;
            int currnode=p.node;
            if(currstops>k)continue;
            for(pair pp:adj.get(currnode)){
                int newnode=pp.node;
                int newcost=currcost+pp.cost;
                if(newcost<cost[newnode] && currstops<=k){
                    cost[newnode]=newcost;
                    qu.offer(new pair(newnode,newcost,currstops+1));
                }
            }

        }
        if(cost[dst]==(int)(1e9))return -1;
        return cost[dst];
    }
}