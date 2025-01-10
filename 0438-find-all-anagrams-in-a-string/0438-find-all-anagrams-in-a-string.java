class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }

        int[] pFreq = new int[26];
        int[] sFreq = new int[26];

        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

        int pLength = p.length();

        for (int i = 0; i < s.length(); i++) {
            sFreq[s.charAt(i) - 'a']++;
            if (i >= pLength) {
                sFreq[s.charAt(i - pLength) - 'a']--;
            }
            if (areEqual(pFreq, sFreq)) {
                result.add(i - pLength + 1);
            }
        }
        return result;
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
