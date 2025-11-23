class Solution {
    public long sumAndMultiply(int n) {
        long ans = 0;
        int x = 0;
        int a = 0;
        while(n > 0){
            int p = n % 10;
            x = x + p;
            if(p > 0){
                ans += p * (long)Math.pow(10,a);
                a++;
            }
            n = n/10;
        }
        System.out.println(ans);
        return ans * (long)x;
    }
}