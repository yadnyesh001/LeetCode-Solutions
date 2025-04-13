class Solution {
    public String smallestPalindrome(String s) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        StringBuilder left = new StringBuilder();
        String middle = "";
        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 == 1) {
                middle = String.valueOf((char) (i + 'a'));
            }
            int count = arr[i] / 2;
            for (int j = 0; j < count; j++) {
                left.append((char) (i + 'a'));
            }
        }
        String right = new StringBuilder(left).reverse().toString();
        return left.toString() + middle + right;
    }
}