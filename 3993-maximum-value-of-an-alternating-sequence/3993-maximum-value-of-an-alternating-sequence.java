class Solution {
    public long maximumValue(int n, int s, int m) {
        long upwardJumps = n / 2;
        if (upwardJumps == 0) {
            return s;
        }
        return (long) s + upwardJumps * m - (upwardJumps - 1);
    }
}