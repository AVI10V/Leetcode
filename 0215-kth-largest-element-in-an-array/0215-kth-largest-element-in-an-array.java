class Solution {
    public int findKthLargest(int[] nums, int k) {
          PriorityQueue<Integer> qu = new PriorityQueue<>((a,b)->b-a);
        for(int x:nums){
            qu.offer(x);
        }
        if(k>nums.length)return -1;
        while(!qu.isEmpty() && k!=0){
            k--;
            int y=qu.poll();
            if(k==0)return y;
        }
        return -1;
    }
}