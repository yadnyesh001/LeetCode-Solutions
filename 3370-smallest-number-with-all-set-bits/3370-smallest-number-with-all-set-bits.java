class Solution {
    public int smallestNumber(int n) {
        int ans = 0;
        int i = 0;
        while(ans < n){
            ans = (int)Math.pow(2,i)-1;
            i++;
        }
        return ans;
    }
}