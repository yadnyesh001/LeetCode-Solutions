class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = 0;
        int maxValuesPlusI = values[0] + 0; 
        for (int j = 1; j < values.length; j++) {
            int currentScore = maxValuesPlusI + values[j] - j;
            maxScore = Math.max(maxScore, currentScore);
            maxValuesPlusI = Math.max(maxValuesPlusI, values[j] + j);
        }
        return maxScore;
    }
}