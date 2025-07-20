class Solution {
    public boolean checkDivisibility(int n) {
        long sum = 0;
        long prod = 1;
        long total = 0;
        int p = n;
        while(n > 0){
            int x = n % 10;
            sum = sum + (long)x;
            prod = prod * (long)x;
            n = n/10;
        }
        total = sum + prod;
        if((long)p % total == 0){
            return true;
        }
        return false;
    }
}