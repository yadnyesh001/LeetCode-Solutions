class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j}); 
                } else {
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0], c = current[1];

            for (int[] dir : directions) {
                int newRow = r + dir[0], newCol = c + dir[1];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && 
                newCol < cols && mat[newRow][newCol] > mat[r][c] + 1) {
                    mat[newRow][newCol] = mat[r][c] + 1;
                    queue.offer(new int[]{newRow, newCol}); 
                }
            }
        }

        return mat;
    }
}