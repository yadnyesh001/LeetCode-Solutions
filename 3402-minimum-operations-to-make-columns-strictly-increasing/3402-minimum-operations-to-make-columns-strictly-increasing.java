class Solution {
    public int minimumOperations(int[][] grid) {
        int sum = 0;
        for (int j = 0; j < grid[0].length; j++) {
            for (int i = 1; i < grid.length; i++) {
                int count = grid[i-1][j] + 1;
                if (grid[i][j] < count) {
                    sum += count - grid[i][j];
                    grid[i][j] = count; 
                }
            }
        }
        return sum;
    }
}
