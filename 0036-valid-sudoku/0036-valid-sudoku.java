class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    if (!boxCheck(board, i, j) || 
                    !rowCheck(board, i, j) || !colCheck(board, i, j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean boxCheck(char[][] board, int i, int j){
        int x = i/3;
        int y = j/3;
        x = x*3;
        y = y*3;
        for(int a=x; a<x+3; a++){
            for(int b=y; b<y+3; b++){
                if(board[a][b] == board[i][j] && i!=a && j!=b){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean rowCheck(char[][] board, int i, int j){
        for(int x=0; x<9; x++){
            if(board[i][j] == board[i][x] && x != j){
                return false;
            }
        }
        return true;
    }

    public boolean colCheck(char[][] board, int i, int j){
        for(int x=0; x<9; x++){
            if(board[i][j] == board[x][j] && x != i){
                return false;
            }
        }
        return true;
    }
}