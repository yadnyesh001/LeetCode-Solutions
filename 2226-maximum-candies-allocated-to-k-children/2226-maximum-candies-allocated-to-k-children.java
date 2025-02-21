class Solution {
    public int maximumCandies(int[] candies, long k) {
        int ans=-1;
        int lo=1, hi=0;

        for(int i=0 ; i<candies.length ; i++){
            if(candies[i] > hi) hi = candies[i];
        }

        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;

            long piles=0;
            for(int i=0 ; i<candies.length ; i++){
                piles+=(long)(candies[i]/mid);
            }

            if(piles >= k) {
                ans=mid;
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }

        return ans == -1 ? 0 : ans;
    }
}