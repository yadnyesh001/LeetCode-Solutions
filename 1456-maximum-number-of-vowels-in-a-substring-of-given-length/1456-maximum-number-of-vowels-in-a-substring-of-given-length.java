class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int count = 0;
        for(int i=0; i<k; i++){
            if(set.contains(s.charAt(i))){
                count++;
            }
        }
        int i=0; 
        int max = count;
        for(int j=k; j<s.length(); j++){
            if(set.contains(s.charAt(i)) && !set.contains(s.charAt(j))){
                count--;
            }
            else if(!set.contains(s.charAt(i)) && set.contains(s.charAt(j))){
                count++;
            }
            max = Math.max(max, count);
            i++;
        }
        return max;
    }
}