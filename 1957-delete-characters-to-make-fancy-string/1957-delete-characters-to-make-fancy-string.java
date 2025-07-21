class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        sb.append(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1) && count < 2){
                count++;
                sb.append(s.charAt(i));
            }
            else if(s.charAt(i) != s.charAt(i-1)){
                count = 1;
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}