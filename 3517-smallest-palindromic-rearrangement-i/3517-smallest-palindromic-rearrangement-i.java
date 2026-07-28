class Solution {
    public String smallestPalindrome(String s) {
        int arr[] = new int[26];
        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }
        StringBuilder first = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < arr[i] / 2; j++) {
                first.append((char)(i + 'a'));
            }
            arr[i] %= 2;   
        }
        StringBuilder ans = new StringBuilder(first);
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 1) {
                ans.append((char)(i + 'a'));
                break;
            }
        }
        ans.append(first.reverse());
        return ans.toString();
    }
}