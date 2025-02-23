class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        int n = grid.length, m = grid[0].length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        for (int i = 0; i < n; i++) {
            PriorityQueue<Integer> rowMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
            for (int j = 0; j < m; j++) {
                rowMaxHeap.add(grid[i][j]);
            }
            for (int j = 0; j < limits[i] && !rowMaxHeap.isEmpty(); j++) {
                int val = rowMaxHeap.poll();
                pq.add(val);
                if (pq.size() > k) {
                    pq.poll(); 
                }
            }
        }
        long sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }
}