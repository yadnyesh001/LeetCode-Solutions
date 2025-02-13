class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] column = new int[col];
        int[] rows = new int[row];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    column[j] = 1;
                    rows[i] = 1;
                }
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(rows[i] == 1 || column[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}