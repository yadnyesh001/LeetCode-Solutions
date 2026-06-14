class Solution {
    public boolean checkGoodInteger(int n) {
        int s = 0;
        int sqs = 0;
        while(n > 0){
            int x = n % 10;
            s = s + x;
            sqs = sqs + x*x;
            n = n/10;
        }
        return (sqs - s) >= 50;
    }
}