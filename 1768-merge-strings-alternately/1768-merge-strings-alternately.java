class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(m > 0 && n > 0){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
            m--;
            n--;
        }
        if(m > 0){
            for(int x = i; x<word1.length(); x++){
                sb.append(word1.charAt(x));
            }
        }
        if(n > 0){
            for(int x = i; x<word2.length(); x++){
                sb.append(word2.charAt(x));
            }
        }
        return sb.toString();
    }
}