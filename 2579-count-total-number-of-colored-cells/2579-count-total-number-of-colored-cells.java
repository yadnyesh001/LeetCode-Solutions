class Solution {
    public long coloredCells(int n) {
        long upper = 0;
        long lower = 0;
        long x = 1;
        for(int i=0; i<n; i++){
            upper += x;
            x += 2; 
        }
        x = 1;
        for(int i=0; i<n-1; i++){
            lower += x;
            x += 2;
        }
        return lower + upper;
    }
}