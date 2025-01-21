class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long[] prefix1 = new long[n];
        long[] prefix2 = new long[n];
        
        prefix1[0] = grid[0][0];
        prefix2[0] = grid[1][0];
        for (int i = 1; i < n; i++) {
            prefix1[i] = prefix1[i-1] + grid[0][i];
            prefix2[i] = prefix2[i-1] + grid[1][i];
        }
        
        long ans = Long.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            long top = prefix1[n-1] - prefix1[i];  
            long bottom = i > 0 ? prefix2[i-1] : 0; 
            long secondRobotPoints = Math.max(top, bottom);
            
            ans = Math.min(ans, secondRobotPoints);
        }
        
        return ans;
    }
}