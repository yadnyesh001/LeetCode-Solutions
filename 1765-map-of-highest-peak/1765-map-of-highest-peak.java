class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        
        int[][] height = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    height[i][j] = 0;  
                    queue.offer(new int[]{i, j});
                } else {
                    height[i][j] = -1;  
                }
            }
        }
        
        int[][] dirs = {{-1,0}, {0,1}, {1,0}, {0,-1}};
        
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];
            
            for (int[] dir : dirs) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if (newRow < 0 || newRow >= m || newCol < 0 || newCol >= n 
                    || height[newRow][newCol] != -1) {
                    continue;
                }
                height[newRow][newCol] = height[row][col] + 1;
                queue.offer(new int[]{newRow, newCol});
            }
        }
        return height;
    }
}