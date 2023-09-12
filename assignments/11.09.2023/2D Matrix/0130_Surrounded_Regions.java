class Solution {
    public void solve(char[][] board) {
        int xlen = board.length;
        int ylen = board[0].length;
        if(xlen<=1 || ylen<=1)return;
        for(int i = 0; i < xlen; i++){
            if(board[i][0] == 'O')boundry(board,i,0);
            if(board[i][ylen-1] == 'O')boundry(board,i,ylen-1);
        }
        for(int j = 0; j < ylen; j++){
            if(board[0][j] == 'O')boundry(board,0,j);
            if(board[xlen-1][j] == 'O')boundry(board,xlen-1,j);
        }

        for(int i = 0; i < xlen; i++){
            for(int j = 0; j < ylen; j++){
                if(board[i][j] == 'O')board[i][j] = 'X';
                else if(board[i][j] == '*')board[i][j] = 'O';
            }
        }
    }
    public static void boundry(char[][] board,int i, int j){
        if(i < 0 || i > board.length - 1 || j < 0 || j > board[0].length)return;

        if(board[i][j] == 'O')board[i][j] = '*';

        if(i > 1 && board[i-1][j] == 'O')boundry(board,i-1,j);
        if(i < board.length-2 && board[i+1][j] == 'O')boundry(board,i+1,j);
        if(j > 1 && board[i][j-1] == 'O')boundry(board,i,j-1);
        if(j < board[0].length-2 && board[i][j+1] == 'O')boundry(board,i,j+1);
    }
}