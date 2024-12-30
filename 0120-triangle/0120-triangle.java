class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        // Create a 2D array to store the minimum path sums
        int[][] arr = new int[m][m];
        
        // Fill the last row of 'arr' with the last row of 'triangle'
        for (int i = 0; i < m; i++) {
            arr[m - 1][i] = triangle.get(m - 1).get(i);
        }
        
        // Iterate from the second to last row upwards to the top
        for (int i = m - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                // Update arr[i][j] with the minimum path sum from the row below
                arr[i][j] = triangle.get(i).get(j) + Math.min(arr[i + 1][j], arr[i + 1][j + 1]);
            }
        }
        
        // The top element now contains the minimum path sum
        return arr[0][0];
    }
}