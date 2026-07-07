class Solution {
    public long sumAndMultiply(int n) {
        long ans = 0;
        long sum = 0;
        int i = 0;
        while(n > 0){
            int x = n%10;
            if(x != 0){
                sum = sum + x;
                ans = (long)x*((long)Math.pow(10, i)) + ans;
                i++;
            }
            n = n/10;
        }
        return ans*sum;
    }
}