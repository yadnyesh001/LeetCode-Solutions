class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sum = 0;
        int curr = 0;
        for(int i=0; i<requests.length; i++){
            sum = sum + Math.abs(requests[i] - curr);
            curr = requests[i];
        }
        return sum;
    }
}