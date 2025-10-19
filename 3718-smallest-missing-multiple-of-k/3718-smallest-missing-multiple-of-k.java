class Solution {
    public int missingMultiple(int[] nums, int k) {
        int freq[] = new int[101];
        for (int i : nums) {
            if (i % k == 0) {
                freq[i / k]++;
            }
        }
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 0) {
                return i * k;
            }
        }
        return freq.length * k;
    }
}