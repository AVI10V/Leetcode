class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        Set<String> st =new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }
        StringBuilder s= new StringBuilder();
        return dfs(s,n,st);

    }
    public String dfs(StringBuilder s, int n , Set<String> st){
        if(s.length()==n){
            if(!st.contains(s.toString()))return s.toString();
            else return "";
        }
        String left=dfs(s.append('0'),n,st);
        if((!left.isEmpty()))return left;

        s.setCharAt((s.length()-1),'1');
        String right=dfs(s,n,st);
        if(!right.isEmpty())return right;
        s.deleteCharAt(s.length()-1);
        return "";
    }
   
}