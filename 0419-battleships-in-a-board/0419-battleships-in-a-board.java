class Solution {
    public int countBattleships(char[][] board) {
        int ans =0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='X'){
                    ans++;
                    dfs(i,j,board);
                    
                }
            }
        }
        return ans;
        
    }
    public void dfs(int r, int c, char[][] board){
        if(r<0||r>board.length-1||c<0||c>board[0].length-1||board[r][c]!='X')return;
        board[r][c]='.';
        dfs(r,c-1,board);
        dfs(r-1,c,board);
        dfs(r,c+1,board);
        dfs(r+1,c,board);

    }
}