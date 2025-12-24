class Solution {
    public int mirrorDistance(int n) {
        int rev = n;
        int abc = 0;
        int i = 0;
        while(n > 0){
            int x = n%10;
            abc = x + (int)Math.pow(10,i)*abc;
            n = n/10;
            i++;
        }
        return Math.abs(abc - rev);
    }
}