class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (true) {
            int digitIndex = -1;
            for (int i = 0; i < sb.length(); i++) {
                if (Character.isDigit(sb.charAt(i))) {
                    digitIndex = i;
                    break;
                }
            }
            if (digitIndex == -1) {
                return sb.toString();
            }
            int removeIndex = -1;
            for (int i = digitIndex - 1; i >= 0; i--) {
                if (!Character.isDigit(sb.charAt(i))) {
                    removeIndex = i;
                    break;
                }
            }
            sb.deleteCharAt(digitIndex);
            sb.deleteCharAt(removeIndex);
        }
    }
}
