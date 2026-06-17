class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sbs = new StringBuilder();
        StringBuilder sbt = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch != '#'){
                sbs.append(ch);
            }
            else if(ch == '#' && sbs.length() == 0){
                continue;
            }
            else{
                sbs.deleteCharAt(sbs.length() - 1);
            }
        }
        for(char ch : t.toCharArray()){
            if(ch != '#'){
                sbt.append(ch);
            }
            else if(ch == '#' && sbt.length() == 0){
                continue;
            }
            else{
                sbt.deleteCharAt(sbt.length() - 1);
            }
        }
        return sbs.toString().equals(sbt.toString());
    }
}