class Solution {
    public boolean isAnagram(String s, String t) {
        int freqs[] = new int[26];
        int freqt[] = new int[26];
        for(int i=0; i<s.length(); i++){
            freqs[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<t.length(); i++){
            freqt[t.charAt(i) - 'a']++;
        }
        for(int i=0; i<26; i++){
            if(freqs[i] != freqt[i]){
                return false;
            }
        }
        return true;
    }
}