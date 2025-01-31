class Solution {
    private int[] directions = {0, 1, 0, -1, 0};
    private int n;
    
    public int largestIsland(int[][] grid) {
        n = grid.length;
        int nextId = 2;
        Map<Integer, Integer> islandSizes = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int size = markIsland(grid, i, j, nextId);
                    islandSizes.put(nextId, size);
                    nextId++;
                }
            }
        }
        
        if (islandSizes.isEmpty()) {
            return 1;
        }
        
        int maxSize = islandSizes.values().stream().mapToInt(Integer::intValue).max().getAsInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> neighborIds = new HashSet<>();
                    for (int d = 0; d < 4; d++) {
                        int ni = i + directions[d];
                        int nj = j + directions[d + 1];
                        if (isValid(ni, nj) && grid[ni][nj] > 1) {
                            neighborIds.add(grid[ni][nj]);
                        }
                    }
                    
                    int totalSize = 1;
                    for (int id : neighborIds) {
                        totalSize += islandSizes.get(id);
                    }
                    maxSize = Math.max(maxSize, totalSize);
                }
            }
        }
        
        return maxSize;
    }
    
    private int markIsland(int[][] grid, int i, int j, int id) {
        if (!isValid(i, j) || grid[i][j] != 1) {
            return 0;
        }
        
        grid[i][j] = id;
        int size = 1;
        
        for (int d = 0; d < 4; d++) {
            size += markIsland(grid, i + directions[d], j + directions[d + 1], id);
        }
        
        return size;
    }
    
    private boolean isValid(int i, int j) {
        return i >= 0 && i < n && j >= 0 && j < n;
    }
}