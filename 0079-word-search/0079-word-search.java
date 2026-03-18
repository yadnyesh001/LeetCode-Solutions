class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        int x = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(check(board, i, j, m, n, x, word)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean check(char board[][], int i, int j, int m, int n, int x, String word){
        if(x == word.length()){
            return true;
        }

        if(i < 0 || i>=m || j < 0 || j >= n || board[i][j] != word.charAt(x)){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = 
        check(board, i+1, j, m, n, x+1, word) ||
        check(board, i-1, j, m, n, x+1, word) ||
        check(board, i, j+1, m, n, x+1, word) ||
        check(board, i, j-1, m, n, x+1, word);

        board[i][j] = temp;
        return found;
    }
}