class Solution {
    public int[] getNoZeroIntegers(int n) {
        int arr[] = new int[2];
        for (int i = 1; i < n; i++) {
            int a = i;
            int b = n - i;
            if (isNoZero(a) && isNoZero(b)) {
                arr[0] = a;
                arr[1] = b;
                break;
            }
        }
        return arr;
    }

    private boolean isNoZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
