class Solution {
    public int maximumSum(int[] nums) {
            HashMap<Integer,Integer> map = new HashMap<>();
            int max=-1;
            for(int x:nums){
                int digitsum=sum(x);
                if(map.containsKey(digitsum)){
                    max=Math.max(max,map.get(digitsum)+x);
                    map.put(digitsum,Math.max(x,map.get(digitsum)));
                }
                else{
                    map.put(digitsum,x);
                }
            }
            return max;
    }
    public int sum(int x){
        int ans =0;
        while(x>0){
            ans+=(x%10);
            x=x/10;

        }
        return ans;
    }
}
