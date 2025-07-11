class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals , (a,b)->Integer.compare(a[0] , b[0]));
        for(int[] x:intervals){
            int n=result.size()-1;
           if(result.isEmpty() || result.get(n)[1]<x[0]){
            result.add(x);
           }
           else{
            result.get(n)[1]=Math.max(x[1] , result.get(n)[1]);
           }
        }
        return result.toArray(new int[result.size()][]);
    }
}