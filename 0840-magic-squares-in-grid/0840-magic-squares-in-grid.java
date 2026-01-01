class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int n = grid[0].length - 2;
        int m = grid.length - 2;
        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){   
                if(isMagic(grid, i, j)){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isMagic(int[][] grid, int i, int j){
        if(grid[i+1][j+1] != 5) return false;

        int[] arr = new int[9];
        for(int x = i; x < i+3; x++){
            for(int y = j; y < j+3; y++){
                if(grid[x][y] < 1 || grid[x][y] > 9){
                    return false;
                }
                arr[grid[x][y] - 1]++;
            }
        }

        for(int k = 0; k < 9; k++){
            if(arr[k] != 1) return false;
        }

        int sum = grid[i][j] + grid[i][j+1] + grid[i][j+2];

        
        for(int r = 0; r < 3; r++){
            if(grid[i+r][j] + grid[i+r][j+1] + grid[i+r][j+2] != sum)
                return false;
        }
        for(int c = 0; c < 3; c++){
            if(grid[i][j+c] + grid[i+1][j+c] + grid[i+2][j+c] != sum)
                return false;
        }

        if(grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2] != sum)
            return false;

        if(grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j] != sum)
            return false;

        return true;
    }
}
