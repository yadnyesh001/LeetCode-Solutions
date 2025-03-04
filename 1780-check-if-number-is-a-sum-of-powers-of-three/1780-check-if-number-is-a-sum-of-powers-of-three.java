class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n > 0){
            int x = n % 3;
            if(x == 2){
                return false;
            }
            n = n/3;
        }
        return true;
    }
}