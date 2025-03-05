class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int i = coins.length-1;
        int count = 0;
        while(amount > 0 && i >= 0){
            if(amount - coins[i] >= 0){
                count++;
                amount = amount - coins[i];
            }
            else{
                i--;
            }
        }
        if(amount > 0){
            return -1;
        }
        return count;
    }
}