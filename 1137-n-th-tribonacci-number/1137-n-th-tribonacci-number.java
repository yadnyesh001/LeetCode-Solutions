class Solution {
    public int tribonacci(int n) {
        int t0 = 0;
        if(n == 0){
            return 0;
        }
        int t1 = 1;
        if(n == 1){
            return 1; 
        }
        int t2 = 1;
        for(int i=3; i<=n; i++){
            int sum = 0;
            sum = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = sum;
        }
        return t2;
    }
}