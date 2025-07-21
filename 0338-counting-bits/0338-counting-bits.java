class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        arr[0] = 0;
        for(int i=1; i<=n; i++){
            int count = 0;
            int x = i;
            while(x > 0){
                count = count + (x & 1);
                x = x >>> 1;
            }
            arr[i] = count;
        }
        return arr;
    }
}