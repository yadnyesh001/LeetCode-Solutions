class Solution {
    public int maxScore(String s) {
        int zero = 0;
        int one = 0;
        int max = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                zero++;
            }
            else{
                one++;
            }
        }
        int x = 0;
        for(int i=0; i<s.length()-1; i++){
            int sum = 0;
            if(s.charAt(i) == '0'){
                x++;
                sum = x + one;
            }
            else{
                one--;
                sum = x + one;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}