class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> st = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            st.put(arr[i],st.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(st.get(arr[i])==1){
                if(k==1)return arr[i];
                else k--;
            }
        }
        return "";
        
    }
}