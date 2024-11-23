class Solution {
    public boolean canAliceWin(int n) {
        boolean ans = false;
        int i = 0;
        while(n >= 0){
            n = n - (10 - i);
            i++;
        }
        if(i % 2 == 0){
            ans = true;
        }
        return ans;
    }
}