class Solution {
    class pair{
        int node;
        long dis;
        public pair(int x, long y){
            this.node=x;
            this.dis=y;
        }
    }
    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<roads.length;i++){
            adj.get(roads[i][0]).add(new pair(roads[i][1],roads[i][2]));
            adj.get(roads[i][1]).add(new pair(roads[i][0],roads[i][2]));
        }
        PriorityQueue<pair> qu= new PriorityQueue<>((a,b)->Long.compare(a.dis,b.dis));
        long[] dist = new long[n];
        int[] ways=new int[n];
        Arrays.fill(dist,Long.MAX_VALUE);
        dist[0]=0;
        ways[0]=1;
        int mod=1_000_000_007;
        qu.offer(new pair(0,0));
        while(!qu.isEmpty()){
            pair pp=qu.poll();
            int parent=pp.node;
            long pardis=pp.dis;
            for(pair p:adj.get(parent)){
                int curr=p.node;
                long currdis=p.dis+pardis;
                if(currdis<dist[curr]){
                    qu.offer(new pair(curr,currdis));
                    dist[curr]=currdis;
                    ways[curr]=ways[parent];
                }
                else if(currdis==dist[curr]){
                    ways[curr]=(ways[curr]+ways[parent])%mod;
                }
            }
        }
        return ways[n-1];

    }
}