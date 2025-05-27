class Solution {
    public int differenceOfSums(int n, int m) {
        int count = 0;
        int c1 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                count += i;
            } 
            else {
                c1 += i;
            }
        }
        return c1 - count;
    }
}