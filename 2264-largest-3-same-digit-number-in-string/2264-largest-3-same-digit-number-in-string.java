class Solution {
    public String largestGoodInteger(String num) {
        char ch = 0;
        int x = 0;
        int count = 1;
        for(int i=1; i<num.length(); i++){
            if(num.charAt(i) == num.charAt(i-1)){
                count++;
            }
            else{
                count = 1;
            }
            if(count == 3){
                if(ch == 0 || ch < num.charAt(i)){
                    ch = num.charAt(i);
                }
            }
        }
        if(ch == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ch);
        sb.append(ch);
        sb.append(ch);
        return sb.toString();
    }
}