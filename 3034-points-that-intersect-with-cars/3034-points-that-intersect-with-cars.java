class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Collections.sort(nums, (a,b) ->Integer.compare(a.get(0),b.get(0)));
        int prevend =0;
        int ans =0;
        for(int i=0;i<nums.size();i++){
            int start=nums.get(i).get(0),end=nums.get(i).get(1);
            if(start>prevend){
               ans+=end-start+1;
            }
            else if(end>prevend){
                ans +=end-prevend;
            }
            prevend=Math.max(end,prevend);

            
        }
        return ans;
    }
}