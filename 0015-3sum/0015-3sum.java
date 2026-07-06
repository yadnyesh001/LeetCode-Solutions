class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> ans = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            int curr = -nums[i];
            for (int j = i + 1; j < n; j++) {
                int target = curr - nums[j];
                if (set.contains(target)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(target);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                set.add(nums[j]);
            }
        }
        list.addAll(ans);
        return list;
    }
}