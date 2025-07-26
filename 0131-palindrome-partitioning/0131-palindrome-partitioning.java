class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        recur(ans , 0 , s , new ArrayList<>());
        return ans;

    }
    public void recur(List<List<String>> ans , int ind , String s , List<String> ds){
        if(ind==s.length()){
            ans.add(new ArrayList<>(ds));
        }
        for(int i=ind;i<s.length();i++){
            if(palind(s ,ind  , i)){
                ds.add(s.substring(ind ,i+1));
                recur(ans ,i+1 , s,ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    public boolean palind(String s , int start , int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end))return false;
            start++;
            end--;

        }
        return true;
    }
}