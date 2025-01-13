class Solution {
    public int minimumLength(String s) {
        int freq[] = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        int count = 0;
        for(int i=0; i<26; i++){
            if(freq[i] >= 3){
                if(freq[i] % 2 == 1){
                    count += freq[i] - 1;
                }
                else{
                    count += freq[i] - 2;
                }
            }
        }
        return s.length() - count;
    }
}