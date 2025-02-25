class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1);
        for (int num : nums) {
            sum += (num % 2 == 0) ? 0 : 1; 
            count += prefixCount.getOrDefault(sum - k, 0); 
            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}