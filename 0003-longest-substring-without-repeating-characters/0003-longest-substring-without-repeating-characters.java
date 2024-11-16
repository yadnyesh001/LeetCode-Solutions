class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ans = new HashSet<>();
        int max = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            while (ans.contains(s.charAt(i))) {
                ans.remove(s.charAt(j));
                j++;
            }
            ans.add(s.charAt(i));
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
