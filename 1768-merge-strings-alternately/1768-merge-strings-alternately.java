class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length()-1;
        int l2 = word2.length()-1;
        int l = l1 + l2 + 2;
        int x1 = 0;
        int x2 = 0;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<l; i++){
            if(i % 2 == 0){
                if(x1 <= l1){
                    ans.append(word1.charAt(x1));
                    x1++;
                }
                else if(x2 <= l2){
                    ans.append(word2.charAt(x2));
                    x2++;
                }
            }
            else{
                if(x2 <= l2){
                    ans.append(word2.charAt(x2));
                    x2++;
                }
                else if(x1 <= l1){
                    ans.append(word1.charAt(x1));
                    x1++;
                }
            }
        }
        return ans.toString();
    }
}