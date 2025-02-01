class Solution {
    public String findValidPair(String s) {
        int[] freq = new int[10];
        for(char c : s.toCharArray()){
            freq[c - '0']++;
        }
        for(int i=0; i<s.length()-1; i++){
            int firstDigit = s.charAt(i) - '0';
            int secondDigit = s.charAt(i + 1) - '0';
            if(firstDigit != secondDigit){
                if(freq[firstDigit] == firstDigit && 
                    freq[secondDigit] == secondDigit){
                    return s.substring(i, i + 2);
                }
            }
        }
        return "";
    }
}