class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();

        // Filter the alphanumeric characters and convert to lowercase
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                ans.append(Character.toLowerCase(ch));
            }
        }

        // Check if the string is a palindrome
        String result = ans.toString();
        for (int i = 0; i < result.length() / 2; i++) {
            if (result.charAt(i) != result.charAt(result.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
