class Solution {
    public int rearrangeCharacters(String s, String target) {
        int arr[] = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch - 'a']++;
        }
        int xyz[] = new int[26];
        for(char ch : target.toCharArray()){
            xyz[ch - 'a']++;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<26; i++){
            if(xyz[i] > 0){
                min = Math.min(min, arr[i]/xyz[i]);
            }
        }
        return min;
    }
}