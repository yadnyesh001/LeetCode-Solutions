class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                sum = sum + Math.abs(matrix[i][j]);
                if(matrix[i][j] < 0){
                    count++;
                }
                min = Math.min(min, Math.abs(matrix[i][j]));
            }
        }
        if(count % 2 == 0){
            return sum;
        }
        return sum - 2*min;
    }
}