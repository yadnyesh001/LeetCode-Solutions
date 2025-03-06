class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int arr[] = new int[2];
        int n = grid.length;
        int freq[] = new int[n*n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                freq[grid[i][j]-1]++;
            }
        }
        for(int i=0; i<n*n; i++){
            if(freq[i] == 0){
                arr[1] = i+1;
            }
            if(freq[i] == 2){
                arr[0] = i+1;
            }
        }
        return arr;
    }
}