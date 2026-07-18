class Solution {
    public String rearrangeString(String s, char x, char y) {
        int arr[] = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        if(arr[y - 'a'] > 0){
            for(int i=0; i<arr[y - 'a']; i++){
                sb.append(y);
            }
        }
        arr[y - 'a'] = 0;
        if(arr[x - 'a'] > 0){
            for(int i=0; i<arr[x - 'a']; i++){
                sb.append(x);
            }
        }
        arr[x - 'a'] = 0;
        for(int i=0; i<26; i++){
            for(int j=0; j<arr[i]; j++){
                sb.append((char)(i + 'a'));
            }
        }
        return sb.toString();
    }
}