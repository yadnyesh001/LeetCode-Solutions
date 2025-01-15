class Solution {
    public int minimizeXor(int num1, int num2) {
        int setBitsNum2 = Integer.bitCount(num2);
        int x = num1;
        int setBitsNum1 = Integer.bitCount(num1);

        if (setBitsNum1 > setBitsNum2) {
            int bitsToUnset = setBitsNum1 - setBitsNum2;
            for (int i = 0; i < 32 && bitsToUnset > 0; i++) {
                if ((x & (1 << i)) != 0) { 
                    x &= ~(1 << i); 
                    bitsToUnset--;
                }
            }
        } 
        else if (setBitsNum1 < setBitsNum2) {
            int bitsToSet = setBitsNum2 - setBitsNum1;
            for (int i = 0; i < 32 && bitsToSet > 0; i++) {
                if ((x & (1 << i)) == 0) { 
                    x |= (1 << i); 
                    bitsToSet--;
                }
            }
        }
        return x;
    }
}