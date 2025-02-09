class Solution {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        long totalPairs = (n * (n - 1)) / 2; 
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        long goodPairs = 0;
        for (int j = 0; j < n; j++) {
            int key = nums[j] - j;
            goodPairs += freqMap.getOrDefault(key, 0);
            freqMap.put(key, freqMap.getOrDefault(key, 0) + 1);
        }
        return totalPairs - goodPairs;
    }
}