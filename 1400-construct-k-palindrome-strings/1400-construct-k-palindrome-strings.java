class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k){
            return false;
        }
        Set<Character> ans = new HashSet<>();
        int count = 0;
        for(char c : s.toCharArray()){
            if(!ans.contains(c)){
                ans.add(c);
                count++;
            }
            else{
                count--;
                ans.remove(c);
            }
        }
        int x = Math.abs(count);
        if(k >= x){
            return true;
        }
        return false;
    }
}