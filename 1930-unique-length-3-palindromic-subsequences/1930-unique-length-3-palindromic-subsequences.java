class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);
        
        for (int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i) - 'a';
            if (first[curr] == -1) {
                first[curr] = i;
            }
            last[curr] = i;
        }
        
        int result = 0;
        for (int i = 0; i < 26; i++) {
            if (first[i] != -1 && last[i] > first[i]) {
                Set<Character> uniqueMiddle = new HashSet<>();
                for (int j = first[i] + 1; j < last[i]; j++) {
                    uniqueMiddle.add(s.charAt(j));
                }
                result += uniqueMiddle.size();
            }
        }
        
        return result;
    }
}