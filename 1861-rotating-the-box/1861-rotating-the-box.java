class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length; 
        int n = box[0].length;
        char arr[][] = new char[n][m];
        for(int i=0; i<m; i++){
            int right = n-1;
            for(int j=n-1; j>=0; j--){
                if(box[i][j] == '*'){
                    right = j - 1;
                } 
                else if(box[i][j] == '#'){
                    if(right != j){
                        box[i][right] = '#';
                        box[i][j] = '.';
                    }
                    right--; 
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[j][m - 1 - i] = box[i][j];
            }
        }
        return arr;
    }
}