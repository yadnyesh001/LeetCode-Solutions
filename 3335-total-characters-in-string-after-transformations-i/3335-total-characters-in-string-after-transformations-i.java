class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int MOD = 1_000_000_007;
        int freq[] = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        for(int i=0; i<t; i++){
            int arr = freq[25];
            for(int j=25; j>0; j--){
               freq[j] = freq[j-1];
            }
            freq[0] = 0;
            freq[0] = (freq[0] + arr) % MOD;
            freq[1] = (freq[1] + arr) % MOD;
        }
        int sum = 0;
        for(int i=0; i<26; i++){
            sum = (sum + freq[i]) % MOD;
        }
        return sum;
    }
}