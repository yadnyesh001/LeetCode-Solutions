class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int max = 0;
        int arr[] = new int[n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == '0'){
                    arr[j] = 0;
                }
                else{
                    arr[j] += 1;
                }
            }
            int x = largestRectangleArea(arr);
            max = Math.max(max, x);
        }
        return max;
    }

    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= len; i++) {
            int h = (i == len ? 0 : heights[i]);
            if (s.isEmpty() || h >= heights[s.peek()]) {
                s.push(i);
            } else {
                int tp = s.pop();
                maxArea = Math.max(maxArea, heights[tp] * (s.isEmpty() ? i : i - 1 - s.peek()));
                i--;
            }
        }
        return maxArea;
    }
}