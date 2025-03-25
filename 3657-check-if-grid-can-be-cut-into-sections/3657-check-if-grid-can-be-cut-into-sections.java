class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
       int[][] x= new int[rectangles.length][2];
       int[][] y= new int[rectangles.length][2];
       for(int i=0;i<rectangles.length;i++){
        x[i][0]=rectangles[i][0];
        x[i][1]=rectangles[i][2];
        y[i][0]=rectangles[i][1];
        y[i][1]=rectangles[i][3];
       }
       Arrays.sort(x ,(a,b)->Integer.compare(a[0],b[0]));
       Arrays.sort(y ,(a,b)->Integer.compare(a[0],b[0]));
       int ver=count(x);
       int hor = count(y);
       return ver>=3 || hor>=3;
        
    }
    public int count(int[][] arr){
        int prevend=0;
        int ans =0;
        for(int i=0;i<arr.length;i++){
            int start=arr[i][0];
            int end =arr[i][1];
            if(start>=prevend){
                ans++;
            }
            prevend=Math.max(end,prevend);
        }
        return ans;
                    
    }
}