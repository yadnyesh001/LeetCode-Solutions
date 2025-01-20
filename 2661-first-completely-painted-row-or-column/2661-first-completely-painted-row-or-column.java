class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length, n = mat[0].length;

        HashMap<Integer, int[]> positionMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                positionMap.put(mat[i][j], new int[]{i, j});
            }
        }

        int[] rowPaintCount = new int[m];
        int[] colPaintCount = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int[] position = positionMap.get(num);
            int row = position[0], col = position[1];

            rowPaintCount[row]++;
            colPaintCount[col]++;

            if (rowPaintCount[row] == n || colPaintCount[col] == m) {
                return i;
            }
        }
        return -1;
    }
}
