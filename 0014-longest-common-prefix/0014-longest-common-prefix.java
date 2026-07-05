class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int min = Integer.MAX_VALUE;
        int n = strs.length;
        for(int i=0; i<n; i++){
            min = Math.min(min, strs[i].length());
        }
        for(int i=0; i<min; i++){
            char ch = strs[0].charAt(i);
            int count = 0;
            for(int j=0; j<n; j++){
                if(strs[j].charAt(i) == ch){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count == n){
                sb.append(ch);
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}