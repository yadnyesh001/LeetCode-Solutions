class Solution {
    public int maximumCandies(int[] candies, long k) {
        int ans = -1;
        int low = 1;
        int high = 0;
        for(int i=0; i<candies.length; i++){
            if(candies[i] > high){
                high = candies[i];
            }
        }
        while(low <= high){
            int mid = low + (high-low)/2;
            long piles = 0;
            for(int i=0; i<candies.length; i++){
                piles += (long)(candies[i]/mid);
            }
            if(piles >= k){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans == -1 ? 0 : ans;
    }
}