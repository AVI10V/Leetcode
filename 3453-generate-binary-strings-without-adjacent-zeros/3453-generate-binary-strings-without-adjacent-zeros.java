class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> validStrings(int n) {
        StringBuilder sb = new StringBuilder();
        recur(0 , n , sb , false);
        return ans;
    }
    public void recur(int i , int n , StringBuilder sb , boolean adj){
        if(i==n){
            ans.add(sb.toString());
            return;
        }
        if(!adj){
            recur(i+1 , n , sb.append('0') , true);
            sb.deleteCharAt(sb.length()-1);
        }
        recur(i+1 , n , sb.append('1') ,false);
        sb.deleteCharAt(sb.length()-1);

    }
}