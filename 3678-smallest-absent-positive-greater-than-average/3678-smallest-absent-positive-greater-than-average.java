class Solution {
    public int smallestAbsent(int[] nums) {
        int n = nums.length;
        double avg = 0;
        for (int i = 0; i < n; i++) {
            avg = avg + nums[i];
        }
        avg = avg / n;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        int ans = (int) Math.floor(avg) + 1;
        while (true) {
            if (ans > 0 && !set.contains(ans)) {
                return ans;
            }
            ans++;
        }
    }
}