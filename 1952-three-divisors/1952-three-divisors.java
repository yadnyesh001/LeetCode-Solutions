class Solution {
    public boolean isThree(int n) {
        int root = (int)Math.sqrt(n);
        if(root * root == n){
            return isPrime(root);
        }
        else{
            return false;
        }
    }

    public boolean isPrime(int x){
        if(x <= 1){
            return false;
        }
        for(int i=2; i*i<=x; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}