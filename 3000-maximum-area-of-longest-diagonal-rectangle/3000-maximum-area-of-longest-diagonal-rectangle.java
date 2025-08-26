class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxdiagonal = 0;
        int area = 0;
        for (int i = 0; i < dimensions.length; i++) {
            double diagonal = Math.sqrt(dimensions[i][0] * dimensions[i][0] + dimensions[i][1] * dimensions[i][1]);
            int currArea = dimensions[i][0] * dimensions[i][1];
            if (diagonal > maxdiagonal) {
                maxdiagonal = diagonal;
                area = currArea;
            } 
            else if (diagonal == maxdiagonal) {
                area = Math.max(area, currArea);
            }
        }
        return area;
    }
}
