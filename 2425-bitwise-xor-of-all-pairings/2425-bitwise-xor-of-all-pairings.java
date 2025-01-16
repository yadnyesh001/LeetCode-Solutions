class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0;
        int xor2 = 0;

        for (int num : nums1) {
            xor1 ^= num;
        }

        for (int num : nums2) {
            xor2 ^= num;
        }

        if (nums1.length % 2 == 1 && nums2.length % 2 == 1) {
            return xor1 ^ xor2;
        } else if (nums1.length % 2 == 1) {
            return xor2;
        } else if (nums2.length % 2 == 1) {
            return xor1;
        } else {
            return 0;
        }
    }
}