class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int sum = 0;
        for(int i=0; i<values.length-1; i++){
            for(int j=i+1; j<values.length; j++){
                int x = 0;
                x = values[i] + values[j] + i - j;
                if(x > sum){
                    sum = x;
                }
            }
        }
        return sum;
    }
}