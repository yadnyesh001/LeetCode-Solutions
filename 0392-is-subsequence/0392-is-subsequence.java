class Solution {
    public boolean isSubsequence(String s, String t) {
        int x = 0;
        for(int i=0; i<t.length(); i++){
            if(x == s.length()){
                return true;
            }
            if(s.charAt(x) == t.charAt(i)){
                x++;
            }
        }
        return x == s.length();
    }
}