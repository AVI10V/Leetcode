class Solution {
    class pair{
        int val;
        int ind;
        public pair(int x, int y){
            this.val=x;
            this.ind=y;
        }
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n=nums.length;
        PriorityQueue<pair> qu = new PriorityQueue<>((a,b)->a.val==b.val?a.ind-b.ind:a.val-b.val);
        for(int i=0;i<nums.length;i++){
            qu.offer(new pair(nums[i],i));
        }
        int[] ans = new int[n];
        while(k!=0){
            pair p=qu.poll();
            int node=p.val;
            int index=p.ind;
            int newnode=node*multiplier;
            qu.offer(new pair(newnode,index));
            k--;
        }
        while(!qu.isEmpty()){
            pair p=qu.poll();
            ans[p.ind]=p.val;
        }
        return ans;
    }
}