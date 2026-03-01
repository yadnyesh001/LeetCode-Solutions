class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        for(int i=0; i<n; i++){
            if(sb.charAt(n-i-1) == 'a' || sb.charAt(n-i-1) == 'e' || 
            sb.charAt(n-i-1) == 'o' || sb.charAt(n-i-1) == 'i' || 
            sb.charAt(n-i-1) == 'u'){
                sb.deleteCharAt(n-i-1);
            }
            else{
                return sb.toString();
            }
        }
        return sb.toString();
    }
}