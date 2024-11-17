class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        int min = Integer.MAX_VALUE;
        for(int i=0; i<strs.length; i++){
            min = Math.min(min, strs[i].length());
        }

        for(int i=0; i<min; i++){
            for(int j=0; j<strs.length-1; j++){
                if(strs[j].charAt(i) != strs[j+1].charAt(i)){
                    return ans.toString();
                }
            }
            ans.append(strs[0].charAt(i));
        }
        return ans.toString(); 
    }
}