class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n = derived.length;
        boolean isValidWithZero = isValidOriginal(derived, 0);
        if (!isValidWithZero) {
            return isValidOriginal(derived, 1);
        }
        return true;
    }

    private boolean isValidOriginal(int[] derived, int startValue) {
        int n = derived.length;
        int[] original = new int[n];
        original[0] = startValue;
        for (int i = 1; i < n; i++) {
            original[i] = original[i - 1] ^ derived[i - 1];
        }
        return (original[n - 1] ^ original[0]) == derived[n - 1];
    }
}
