class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count =1;
        int n=intervals.length;
        Arrays.sort(intervals, new cmp());
        int dead=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]>=dead){
                count++;
                dead=intervals[i][1];
            }

        }
        return n-count;

        
    }
   
    static class cmp implements Comparator<int[]>{
        public int compare(int[] a , int[] b){
            return a[1]-b[1];
        }
    }
}