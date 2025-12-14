class Solution {
    public String reverseWords(String s) {
        int count = 0;
        String[] words = s.split(" ");
        int arr[] = new int[26];
        for(int i=0; i<words[0].length(); i++){
            arr[words[0].charAt(i) - 'a']++;
        }
        count = arr[0] + arr[4] + arr[8] + arr[14] + arr[20];
        for(int i=1; i<words.length; i++){
            int pqr[] = new int[26];
            for(int j=0; j<words[i].length(); j++){
                pqr[words[i].charAt(j) - 'a']++;
            }
            int sum = pqr[0] + pqr[4] + pqr[8] + pqr[14] + pqr[20];
            if(sum == count){
                String reversed = new StringBuilder(words[i]).reverse().toString();
                words[i] = reversed;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<words.length; i++){
            sb.append(words[i]);
            if(i != words.length-1){
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}