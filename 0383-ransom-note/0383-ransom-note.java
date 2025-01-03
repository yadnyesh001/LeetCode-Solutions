class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int i = ransomNote.length();
        int j = magazine.length();
        int x = 0;
        int y = 0;
        while(x < i && y < j){
            if(ransomNote.charAt(x) == magazine.charAt(y)){
                x++;
            }
            y++;
        }
        return x == i;
    }
}