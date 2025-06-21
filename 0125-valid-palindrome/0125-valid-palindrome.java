class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                ans.append(Character.toLowerCase(ch));
            }
        }
        String res = ans.toString();
        for(int i=0; i<res.length()/2; i++){
            if(res.charAt(i) != res.charAt(res.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}