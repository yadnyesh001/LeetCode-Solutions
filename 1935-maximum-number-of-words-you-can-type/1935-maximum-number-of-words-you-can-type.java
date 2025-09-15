class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int arr[] = new int[26];
        for(char ch : brokenLetters.toCharArray()){
            arr[ch - 'a']++;
        }
        int count = 0;
        String[] res = text.split(" ");
        for(int i=0; i<res.length; i++){
            boolean x = true;
            for(int j=0; j<res[i].length(); j++){
                if(arr[res[i].charAt(j) - 'a'] > 0){
                    x = false;
                    break;
                }
            }
            if(x){
                count++;
            }
        }
        return count;
    }
}