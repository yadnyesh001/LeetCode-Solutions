class Solution {
    public int pivotInteger(int n) {
        int total = (int)(n)*(n+1)/2;
        int ans = 0;
        for(int i=1; i<=n; i++){
            ans = ans + i;
            if(ans == total){
                return i;
            }
            if(ans > total){
                break;
            }
            total = total - i;
        }
        return -1;
    }
}