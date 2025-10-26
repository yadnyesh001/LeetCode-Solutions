class Solution {
    public long removeZeros(long n) {
        long x = 0;
        int i = 0;
        while(n > 0){
            long y = n % (long)10;
            if(y > 0){
                x = x + (long)Math.pow(10,i++)*y;
            }
            n = n/10;
        }
        return x;
    }
}