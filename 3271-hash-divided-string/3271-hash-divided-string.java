class Solution {
    public String stringHash(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int sum = 0;
        int count = 0;
        for(char ch : s.toCharArray()){
            sum += ch - 'a';
            count++;
            if (count == k) {
                count = 0;
                ans.append((char) ('a' + (sum % 26)));
                sum = 0; 
            }
        }
        if (count > 0) {
            ans.append((char) ('a' + (sum % 26)));
        }
        return ans.toString();
    }
}