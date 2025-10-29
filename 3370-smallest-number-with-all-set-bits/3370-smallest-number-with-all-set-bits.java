class Solution {
    public int smallestNumber(int n) {
        if(n == 1){
            return 1;
        }
        int x = 0;
        while((int)Math.pow(2,x) <= n){
            x++;
        }
        return (int)Math.pow(2,x)-1;
    }
}