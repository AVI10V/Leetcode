class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> qu = new PriorityQueue<>((a,b)->b-a);
        for(int x:stones){
           qu.offer(x);
        }
        while(!qu.isEmpty()){
            if(qu.size()==1)return qu.poll();
            int x=qu.poll();
            int y=qu.poll();
            if(x!=y){
                qu.offer(Math.abs(x-y));
            }
        }
        return 0;
    }
}