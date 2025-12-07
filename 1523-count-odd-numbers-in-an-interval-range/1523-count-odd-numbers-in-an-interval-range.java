class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        if(low % 2 == 1 || high % 2 == 1){
            count = 1;
        }
        return count + (high-low)/2;
    }
}