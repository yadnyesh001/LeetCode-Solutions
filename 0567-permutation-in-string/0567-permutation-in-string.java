class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1freq = new int[26];
        int[] s2freq = new int[26];

        for (char c : s1.toCharArray()) {
            s1freq[c - 'a']++;
        }

        int s1Length = s1.length();

        for (int i = 0; i < s1Length; i++) {
            s2freq[s2.charAt(i) - 'a']++;
        }

        if (areEqual(s1freq, s2freq)) {
            return true;
        }

        for (int i = s1Length; i < s2.length(); i++) {
            s2freq[s2.charAt(i) - 'a']++;

            s2freq[s2.charAt(i - s1Length) - 'a']--;

            if (areEqual(s1freq, s2freq)) {
                return true;
            }
        }

        return false;
    }
    
    private boolean areEqual(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
