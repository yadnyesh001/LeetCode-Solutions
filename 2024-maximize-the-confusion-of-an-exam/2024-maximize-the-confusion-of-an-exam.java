class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(correct(answerKey, k), wrong(answerKey, k));
    }

    public int correct(String s, int k){
        int max = 0;
        int count = 0;
        int right = 0;
        int left = 0;
        while(right < s.length()){
            if(s.charAt(right) == 'F'){
                count++;
            }
            while(count > k){
                if(s.charAt(left) == 'F'){
                    count--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }

    public int wrong(String s, int k){
        int max = 0;
        int count = 0;
        int right = 0;
        int left = 0;
        while(right < s.length()){
            if(s.charAt(right) == 'T'){
                count++;
            }
            while(count > k){
                if(s.charAt(left) == 'T'){
                    count--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}