class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        int[][] temp = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp[i][j]=board[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int curr=temp[i][j];
                int[] arr=count(i,j,temp);
                int live =arr[0];
                int dead=arr[1]; 
                if(curr==0){
                    if(live==3){
                        board[i][j]=1;
                    }
                }
                else{
                    if(live<2){
                        board[i][j]=0;
                    }
                    else if(live==2 || live ==3){
                        board[i][j]=1;
                    }
                    else if(live>3){
                        board[i][j]=0;
                    }
                }
            }
        }
        

    }
    public int[] count(int i , int j , int[][] temp){
        int[] ans = new int[2];
        int live =0;
        int dead=0;
        int n=temp.length;
        int m=temp[0].length;
        int[] dr={0,-1,-1,-1,0,+1 , +1, +1};
        int[] dc={-1, -1 , 0,+1 ,1,1,0,-1};
        for(int p=0;p<8;p++){
            int nrow=i+dr[p];
            int ncol=j+dc[p];
            if(nrow <0 || nrow>=n || ncol<0 || ncol>=m){
                continue;
            }
            else if(temp[nrow][ncol]==1){
                live++;
            }
            else{
                dead++;
            }
            
        }
        ans[0]=live;
        ans[1]=dead;
        return ans;
    }
}