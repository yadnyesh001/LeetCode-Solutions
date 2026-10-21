class Solution {
    public boolean threeFibonacciSum(int n) {
        int x1 = 0;
        int x2 = 1;
        int x3 = 1;
        int sum = 0;
        while(sum < n){
            sum = x1 + x2 + x3;
            if(sum == n){
                return true;
            }
            x3 = x2 + x3;
            x2 = x2 + x1;
            x1 = x2 - x1;
        }
        return false;
    }
}