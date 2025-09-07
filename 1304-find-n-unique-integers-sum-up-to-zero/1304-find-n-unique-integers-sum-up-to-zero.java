class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i;
        }
        for(int i=0; i<n; i++){
            arr[i] -= n/2;
        }
        if(n % 2 == 1){
            return arr;
        }
        for(int i=n/2; i<n; i++){
            arr[i]++;
        }
        return arr;
    }
}