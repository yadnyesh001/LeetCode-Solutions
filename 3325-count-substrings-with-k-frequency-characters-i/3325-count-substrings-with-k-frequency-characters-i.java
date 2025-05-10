class Solution {
    public int numberOfSubstrings(String s, int k) {
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;
                for (int c = 0; c < 26; c++) {
                    if (freq[c] == k) {
                        count++;
                        break; 
                    }
                }
            }
        }
        return count;
    }
}
