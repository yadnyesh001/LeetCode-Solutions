class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxElement) {
                maxElement = nums[i];
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == maxElement) {
                list.add(i);
            }
            int freq = list.size();
            if (freq >= k) {
                ans += list.get(freq - k) + 1;
            }
        }
        return ans;
    }
}