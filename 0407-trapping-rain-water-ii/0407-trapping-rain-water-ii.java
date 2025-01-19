public class Solution {
    private static class Cell {
        int row;
        int col;
        int height;
        
        Cell(int row, int col, int height) {
            this.row = row;
            this.col = col;
            this.height = height;
        }
    }
    
    public int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap.length <= 2 || heightMap[0].length <= 2) {
            return 0;
        }
        
        int m = heightMap.length;
        int n = heightMap[0].length;
        
        PriorityQueue<Cell> minHeap = new PriorityQueue<>((a, b) -> a.height - b.height);
        
        boolean[][] visited = new boolean[m][n];
        
        for (int j = 0; j < n; j++) {
            minHeap.offer(new Cell(0, j, heightMap[0][j]));
            minHeap.offer(new Cell(m-1, j, heightMap[m-1][j]));
            visited[0][j] = true;
            visited[m-1][j] = true;
        }
        
        for (int i = 1; i < m-1; i++) {
            minHeap.offer(new Cell(i, 0, heightMap[i][0]));
            minHeap.offer(new Cell(i, n-1, heightMap[i][n-1]));
            visited[i][0] = true;
            visited[i][n-1] = true;
        }
        
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        int water = 0;
        int maxBoundaryHeight = Integer.MIN_VALUE;
        
        while (!minHeap.isEmpty()) {
            Cell current = minHeap.poll();
            maxBoundaryHeight = Math.max(maxBoundaryHeight, current.height);
            
            for (int[] dir : dirs) {
                int newRow = current.row + dir[0];
                int newCol = current.col + dir[1];
                
                if (newRow < 0 || newRow >= m || newCol < 0 || newCol >= n || visited[newRow][newCol]) {
                    continue;
                }
                
                visited[newRow][newCol] = true;
                if (heightMap[newRow][newCol] < maxBoundaryHeight) {
                    water += maxBoundaryHeight - heightMap[newRow][newCol];
                }
                minHeap.offer(new Cell(newRow, newCol, heightMap[newRow][newCol]));
            }
        }
        
        return water;
    }
}