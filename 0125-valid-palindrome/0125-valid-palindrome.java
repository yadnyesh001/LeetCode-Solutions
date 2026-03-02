class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        String res = sb.toString();
        int n = res.length();
        for(int i=0; i<n/2; i++){
            if(res.charAt(i) != sb.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}