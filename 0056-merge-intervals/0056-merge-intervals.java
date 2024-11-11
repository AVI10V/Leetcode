class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> merged = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int i=0;
       for(int[] x:intervals){
        if(merged.isEmpty()|| merged.get(merged.size()-1)[1]<x[0]){
            merged.add(x);
        }
        else{
            merged.get(merged.size()-1)[1]=Math.max(merged.get(merged.size()-1)[1],x[1]);
        }
       }
        return merged.toArray(new int[merged.size()][]);
    }
}