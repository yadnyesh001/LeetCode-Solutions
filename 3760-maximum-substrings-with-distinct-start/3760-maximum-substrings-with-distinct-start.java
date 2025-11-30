class Solution {
    public int maxDistinct(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(!set.contains(ch)){
                count++;
                set.add(ch);
            }
        }
        return count;
    }
}