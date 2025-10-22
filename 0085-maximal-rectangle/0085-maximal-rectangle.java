class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix[0].length;
        int n = matrix.length;
        int arr[] = new int[m];
        for(int i=0; i<m; i++){
            if(matrix[0][i] == '1'){
                arr[i] = 1;
            }
            else{
                arr[i] = 0;
            }
        }   
        int x = maxHistogram(arr);
        for(int i=1; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == '1'){
                    arr[j]++;
                }
                else{
                    arr[j] = 0;
                }
            }
            x = Math.max(x, maxHistogram(arr));
        }
        return x;
    }

    public int maxHistogram(int arr[]){
        int n = arr.length;
        int max = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<=n; i++){
            int h;
            if(i == n){
                h = 0;
            }
            else{
                h = arr[i];
            }
            if(st.isEmpty() || h > arr[st.peek()]){
                st.push(i);
            }
            else{
                int tp = st.pop();
                max = Math.max(max, arr[tp] * (st.isEmpty() ? i : i-1-st.peek()));
                i--;
            }
        }
        return max;
    }
}