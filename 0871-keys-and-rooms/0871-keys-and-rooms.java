class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n= rooms.size();
        if(n==0)return false;
        boolean[] vis = new boolean[n];
        Queue<Integer> qu = new LinkedList<Integer>();
        for(int i=0;i<rooms.get(0).size();i++){
            qu.offer(rooms.get(0).get(i));
        }
        vis[0]=true;
        while(!qu.isEmpty()){
            int room=qu.poll();
            vis[room]=true;
            for(int x:rooms.get(room)){
                if(!vis[x]){
                    qu.offer(x);
                }
            }

        }
        for(int i=0;i<n;i++){
            if(vis[i]==false)return false;
        }
        return true;


        
    }
}