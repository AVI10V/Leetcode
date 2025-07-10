class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int sum=0;
        int actual=0;
        for(int x:nums){
            actual+=x;
            if(st.contains(x))continue;
            else{
                sum+=(x*2);
                st.add(x);
            }

        }
        return sum-actual;


    }
}