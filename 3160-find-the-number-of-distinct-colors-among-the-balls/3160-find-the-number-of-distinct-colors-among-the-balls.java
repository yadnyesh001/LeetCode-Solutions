class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int[] result = new int[n];
        Map<Integer, Integer> ballColorMap = new HashMap<>(); 
        Map<Integer, Integer> colorCount = new HashMap<>();   
        Set<Integer> uniqueColors = new HashSet<>();          
        for (int i = 0; i < n; i++) {
            int ball = queries[i][0];
            int newColor = queries[i][1];
            if (ballColorMap.containsKey(ball)) {
                int prevColor = ballColorMap.get(ball);
                colorCount.put(prevColor, colorCount.get(prevColor) - 1);
                if (colorCount.get(prevColor) == 0) {
                    uniqueColors.remove(prevColor);
                }
            }
            ballColorMap.put(ball, newColor);
            colorCount.put(newColor, colorCount.getOrDefault(newColor, 0) + 1);
            uniqueColors.add(newColor);
            result[i] = uniqueColors.size();
        }
        return result;
    }
}
