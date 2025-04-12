class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int L = 32 - Integer.numberOfLeadingZeros(n);
        return 1 << L;
    }
}