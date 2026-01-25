class Solution {
    public int[] rotateElements(int[] nums, int k) {
        List<Integer> positives = new ArrayList<>();
        for (int num : nums) {
            if (num >= 0) {
                positives.add(num);
            }
        }
        int count = positives.size();
        if (count == 0) return nums; 
        k = k % count;

        List<Integer> rotated = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            rotated.add(positives.get((i + k) % count));
        }
        
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                nums[i] = rotated.get(idx++);
            }
        }

        return nums;
    }
}
