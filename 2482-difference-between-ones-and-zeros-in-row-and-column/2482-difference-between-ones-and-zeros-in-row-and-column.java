class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int col[] = new int[grid[0].length];
        int row[] = new int[grid.length];

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    row[i]++;
                }
            }
        }

        for(int i=0; i<grid[0].length; i++){
            for(int j=0; j<grid.length; j++){
                if(grid[j][i] == 1){
                    col[i]++;
                }
            }
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                grid[i][j] = row[i] + col[j] - (grid[0].length-row[i]) - (grid.length - col[j]);
            }
        }
        return grid;
    }
}