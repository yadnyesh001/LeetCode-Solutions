class Solution {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 == 1) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (locked.charAt(i) == '1') {
                if (s.charAt(i) == ')') {
                    count++;
                    if (count > 0) {
                        return false;
                    }
                } else {
                    count--;
                }
            } else {
                count--; 
            }
        }
        if (count > 0) {
            return false;
        }

        count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (locked.charAt(i) == '1') {
                if (s.charAt(i) == '(') {
                    count++;
                    if (count > 0) { 
                        return false;
                    }
                } else {
                    count--;
                }
            } else {
                count--;
            }
        }
        return count <= 0;
    }
}
 