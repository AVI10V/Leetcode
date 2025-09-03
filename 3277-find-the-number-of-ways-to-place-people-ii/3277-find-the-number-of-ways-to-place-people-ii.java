class Solution {
    public int numberOfPairs(int[][] points) {
        int n=points.length;
        Arrays.sort(points , (a,b) -> a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
        int ans =0;
        for(int i=0;i<n;i++){
            //upper left corner
            int x1=points[i][0];
            int y1=points[i][1];
            int maxy=Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++){
               int x2=points[j][0];
               int y2=points[j][1];
               if(y1>=y2){
                 if (x2 >= x1 && y2 <= y1 && maxy < y2) {
                        ans++;
                    }
                    if (y2 > maxy) maxy = y2;
               }
               
            }
              
        }
        return ans;
    }
}