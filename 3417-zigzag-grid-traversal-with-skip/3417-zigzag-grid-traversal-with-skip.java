class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        boolean goingRight = true;
        
        for (int row = 0; row < rows; row++) {
            if (goingRight) {
                for (int col = 0; col < cols; col++) {
                    if ((row + col) % 2 == 0) {
                        result.add(grid[row][col]);
                    }
                }
            } 
            else {
                for (int col = cols - 1; col >= 0; col--) {
                    if ((row + col) % 2 == 0) {
                        result.add(grid[row][col]);
                    }
                }
            }
        
            goingRight = !goingRight;
        }
        
        return result;
    }
}