class Solution {
    public int trailingZeroes(int n) {
        int count = 1;
        int sum = 0;
        while(n/count != 0){
            sum = sum + (n/5);
            count++;
            n = n/5;
        }
        return sum;
    }
}