class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        int result = numsDivide[0];
        for (int i = 1; i < numsDivide.length; i++) {
            result = gcd(result, numsDivide[i]);
            if(result == 1){
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (result % nums[i] == 0) {
                return i; 
            }
        }
        return -1;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}