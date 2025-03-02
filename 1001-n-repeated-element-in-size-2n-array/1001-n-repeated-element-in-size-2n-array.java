class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> st= new HashSet<>();
        for(int x:nums){
            if(st.contains(x))return x;
            else{
                st.add(x);
            }
        }
        return -1;
    }
}