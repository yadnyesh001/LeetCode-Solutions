class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 0;
        for(int i=0; i<piles.length; i++){
            if(max < piles[i]){
                max = piles[i];
            }
        }
        if(h == piles.length){
            return max;
        }
        while(min <= max){
            int count = 0;
            int mid = min + (max-min)/2;
            for(int i=0; i<piles.length; i++){
                if(piles[i] % mid != 0){
                    count = count + (piles[i]/mid) + 1;
                }
                else{
                    count = count + piles[i]/mid;
                }
            }
            if(count <= h && count > 0){
                max = mid - 1;
            }
            else if(count > h || count < 0){
                min = mid + 1;
            }
        }
        return min;
    }
}