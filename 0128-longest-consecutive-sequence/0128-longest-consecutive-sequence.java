class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n=nums.length;
        if(n==0)return 0;
        for(int i =0;i<n;i++){
            set.add(nums[i]);
        }
        int max=0;
        for(int i=0;i<n;i++){
            int ans =0;
            if(set.contains(nums[i])){
                ans++;
                int x=nums[i]-1;
                int y=nums[i]+1;
                while(set.contains(x)){
                    ans++;
                    set.remove(x);
                    x--;
                    
                }
                while(set.contains(y)){
                    ans++;
                    set.remove(y);
                    y++;
                }
                max=Math.max(max ,ans);
            }
        }
        return max;
    }
}