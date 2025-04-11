class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int common =0;
        int[] ans = new int[A.length];
        Set<Integer> seta= new HashSet<Integer>();
        Set<Integer> setb= new HashSet<Integer>();
        for(int i=0;i<A.length;i++){
            seta.add(A[i]);
            setb.add(B[i]);
            if(A[i]==B[i]){
                common++;
                ans[i]=common;
            }

            else{
                if(seta.contains(B[i]))common++;
                if(setb.contains(A[i]))common++;
                ans[i]=common;
            }
        }
        return ans;
    }
}