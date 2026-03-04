class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat[0].length;
        int m = mat.length;
        int arr[][] = new int[m][n];
        for(int i=0; i<m; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            if(count == 1){
                for(int j=0; j<n; j++){
                    if(mat[i][j] == 1){
                        arr[i][j]++;
                    }
                }
            }
        }
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<m; j++){
                if(mat[j][i] == 1){
                    count++;
                }
            }
            if(count == 1){
                for(int j=0; j<m; j++){
                    if(mat[j][i] == 1){
                        arr[j][i]++;
                    }
                }
            }
        }
        int ans = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 2){
                    ans++;
                }
            }
        }
        return ans;
    }
}