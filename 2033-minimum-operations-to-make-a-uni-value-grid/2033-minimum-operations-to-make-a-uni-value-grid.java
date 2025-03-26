class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int arr[] = new int[m*n];
        int index = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                arr[index] = (grid[i][j]);
                index++;
            }
        }
        Arrays.sort(arr);
        int sum = 0;
        int median = arr[arr.length/2];
        for(int i=0; i<arr.length; i++){
            if(Math.abs(arr[i] - median) % x != 0){
                return -1;
            }
            else{
                sum = sum + Math.abs(arr[i] - median)/x;
            }
        }
        return sum;
    }
}