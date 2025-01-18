class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, 0, 0}); 
        
        boolean[][] visited = new boolean[m][n];

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int cost = current[0];
            int row = current[1];
            int col = current[2];

            if (row == m - 1 && col == n - 1) {
                return cost;
            }

            if (visited[row][col]) continue;
            visited[row][col] = true;

            for (int d = 0; d < 4; d++) {
                int newRow = row + directions[d][0];
                int newCol = col + directions[d][1];
                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n) {
                    int newCost = cost + (grid[row][col] == d + 1 ? 0 : 1);
                    pq.offer(new int[]{newCost, newRow, newCol});
                }
            }
        }

        return -1;
    }
}
