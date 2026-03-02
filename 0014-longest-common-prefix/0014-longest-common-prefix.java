class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int min = Integer.MAX_VALUE;
        for(int i=0; i<strs.length; i++){
            min = Math.min(min, strs[i].length());
        }
        for(int i=0; i<min; i++){
            char ch = strs[0].charAt(i);
            int count = 0;
            for(int j=1; j<strs.length; j++){
                if(strs[j].charAt(i) == ch){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count == strs.length-1){
                sb.append(ch);
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}