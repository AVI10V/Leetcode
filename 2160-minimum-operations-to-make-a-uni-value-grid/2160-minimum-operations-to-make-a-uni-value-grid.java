class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> ans = new ArrayList<>();
        for(int[] row:grid){
            for(int y:row){
                ans.add(y);
            }
        }
        Collections.sort(ans);
        int num=ans.get(0)%x;
        for(int val:ans){
            if(val%x!=num)return -1;
        }
        int median = ans.get(ans.size()/2);
        int ops=0;
        for(int n:ans){
            ops+=Math.abs(n-median)/x;
        }
        return ops;

    }
}