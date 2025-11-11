class Solution {
    public int firstUniqChar(String s) {
        List<Character> list = new ArrayList<>();
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                list.add(ch);
            }
            else{
                set.add(ch);
            }
        }
        int index = -1;
        int x = 0;
        for(char ch : s.toCharArray()){
            if(!list.contains(ch)){
                index = x;
                break;
            }
            x++;
        }
        return index;
    }
}