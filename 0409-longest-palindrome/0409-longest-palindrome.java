class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        int sumEven = 0;
        int hasOdd = 0;

        for (int count : charCountMap.values()) {
            if (count % 2 == 0) {
                sumEven += count;
            } else {
                sumEven += count - 1;
                hasOdd = 1;
            }
        }
        return sumEven + hasOdd;
    }
}
