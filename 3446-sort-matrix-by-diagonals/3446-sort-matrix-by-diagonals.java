class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
            for (int j = i, k = 0; k < n - i; j++, k++) {
                maxHeap.add(grid[j][k]);
            }
            for (int j = i, k = 0; k < n - i; j++, k++) {
                grid[j][k] = maxHeap.poll();
            }
        }

        for (int i = 0; i < n; i++) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);
            for (int j = 0, k = n - i; k < n; j++, k++) {
                minHeap.add(grid[j][k]);
            }
            for (int j = 0, k = n - i; k < n; j++, k++) {
                grid[j][k] = minHeap.poll();
            }
        }
        return grid;
    }
}