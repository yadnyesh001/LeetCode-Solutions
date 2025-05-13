class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long total = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                total += grid[i][j];
            }
        }
        if(total % 2 == 1){
            return false;
        }
        long sum = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                sum = sum + grid[i][j];
            }
            if(sum*2 == total){
                return true;
            }
        }
        sum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                sum = sum + grid[j][i];
            }
            if(sum*2 == total){
                return true;
            }
        }
        return false;
    }
}