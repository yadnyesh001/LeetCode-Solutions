class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        for(int i=0; i<k; i++){
            sum = sum + arr[i];
        }
        int left = 0;
        int avg = sum/k;
        if(avg >= threshold){
            count++;
        }
        for(int i=k; i<arr.length; i++){
            sum = sum + arr[i] - arr[left++];
            avg = sum/k;
            if(avg >= threshold){
                count++;
            }
        }
        return count;
    }
}