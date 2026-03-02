class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        int x = 0;
        for(int i=0; i<t.length(); i++){
            if(x == s.length()){
                break;
            }
            if(s.charAt(x) == t.charAt(i)){
                count++;
                x++;
            }
        }
        return s.length() == count;
    }
}