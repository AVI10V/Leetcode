class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int row=image.length;
        int col=image[0].length;
        int orignalcolor=image[sr][sc];
        if(orignalcolor!=color){
            dfs(image,sr,sc,color,orignalcolor);
        }
                
        return image;
    }
    public void dfs(int[][] image, int r, int c , int color , int oc){
        if(r<0 || r>=image.length|| c<0 || c>=image[0].length|| image[r][c]!=oc)return;
        image[r][c]=color;
        dfs(image,r-1,c,color,oc);
        dfs(image,r+1,c,color,oc);
        dfs(image,r,c-1,color,oc);
        dfs(image,r,c+1,color,oc);
    }
}