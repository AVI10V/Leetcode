class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Map<Integer , Integer> map = new HashMap<>();
       int m=nums2.length;
       Stack<Integer> st = new Stack<>();
       for(int i=m-1;i>=0;i--){
         while(!st.isEmpty() && st.peek()<=nums2[i]){
            st.pop();
         }
         int right=st.isEmpty()?-1:st.peek();
         map.put(nums2[i] , right);
         st.push(nums2[i]);
       }
       int n=nums1.length;
       for(int i=0;i<n;i++){
         nums1[i]=map.get(nums1[i]);
       }
       return nums1;


    }
}