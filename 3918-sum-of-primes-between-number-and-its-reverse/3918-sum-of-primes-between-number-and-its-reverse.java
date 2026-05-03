class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev = 0;
        int curr = n;
        while(n > 0){
            int r = n % 10;
            rev = rev*10 + r;
            n = n/10;
        }
        int min = Math.min(rev, curr);
        int max = Math.max(rev, curr);
        int sum = 0;
        for(int i=min; i<= max; i++){
            if(isPrime(i)){
                sum = sum + i;
                System.out.println(i);
            }
        }
        return sum;
    }

    public boolean isPrime(int x){
        if(x == 1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(x); i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}