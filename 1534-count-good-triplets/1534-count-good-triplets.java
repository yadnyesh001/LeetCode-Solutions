class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int max=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(0<=i && i<j && j<k && k<n && 
                    arr[i]-arr[j] <= a && arr[i]-arr[j] >= -a &&
                    arr[j]-arr[k] <= b && arr[j]-arr[k] >= -b &&
                    arr[i]-arr[k] <= c && arr[i]-arr[k] >= -c){
                        max++;
                    }
                }
            }    
        }
        return max;
    }
}