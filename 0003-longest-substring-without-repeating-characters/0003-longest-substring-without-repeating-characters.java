class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        Set<Character> ans = new HashSet<>();
        while (right < s.length()) {
            if (!ans.contains(s.charAt(right))) {
                ans.add(s.charAt(right));
                right++;
                max = Math.max(max, right - left);
            } else {
                ans.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
