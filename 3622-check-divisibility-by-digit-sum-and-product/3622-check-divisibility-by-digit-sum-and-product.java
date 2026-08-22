class Solution {
    public boolean checkDivisibility(int n) {
        long sum = 0;
        long prod = 1;
        int x = n;
        while(x > 0){
            int r = x % 10;
            prod = prod * r;
            sum = sum + r;
            x = x/10;
        }
        return n % (sum + prod) == 0;
    }
}