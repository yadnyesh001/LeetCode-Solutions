class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(int i=0; i<patterns.length; i++){
            boolean contains = word.contains(patterns[i]);
            if(contains){
                count++;
            }
        }
        return count;
    }
}