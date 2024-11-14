class Solution {
    public int maximumCandies(int[] candies, long k) {
        int min = 1;
        int max = 0;
        for(int i=0; i<candies.length; i++){
            if(max < candies[i]){
                max = candies[i];
            }
        }
        long left = 1;
        long right = max;
        int result = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long count = 0;
            for (int candy : candies) {
                count += candy / mid;
            }
            if (count >= k) {
                result = (int) mid; 
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}