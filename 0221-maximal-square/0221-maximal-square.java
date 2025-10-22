class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix[0].length;
        int n = matrix.length;
        int maxSide = 0;
        int arr[][] = new int[n+1][m+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(matrix[i-1][j-1] == '1'){
                    arr[i][j] = Math.min(arr[i-1][j], Math.min(arr[i][j-1], arr[i-1][j-1])) + 1;
                    maxSide = Math.max(maxSide, arr[i][j]);
                }
            }
        }
        return maxSide*maxSide;
    }
}