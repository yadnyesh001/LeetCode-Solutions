class Solution {
    public int minOperations(String s) {
        int maxSteps = 0;
        String ans = s;
        for(char ch : ans.toCharArray()){
            int steps = (26 - (ch - 'a')) % 26;
            maxSteps = Math.max(maxSteps, steps);
        }
        return maxSteps;
    }
}
