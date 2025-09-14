class Solution {
    public int maxArea(int[] height) {
        int s=0;
        int e=height.length-1;
        int ans =0;
        int max =Integer.MIN_VALUE;
        while(s<e){
          int area=Math.min(height[s] , height[e])*(e-s);
          max=Math.max(max ,area);
          if(height[s]<height[e]){
            s++;
          }
          else if(height[e]>height[s]){
            e--;
          }
          else{
            e--;
          }
        }
        return max;
    }
}