class Solution {
    public int maxFreqSum(String s) {
        int arr[] = new int[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }
        int max1 = 0;
        int max2 = 0;
        for(int i=0; i<26; i++){
            if(i == 0 || i == 4 || i == 8 || i == 14 || i == 20){
                max1 = Math.max(max1, arr[i]);
            }
            else{
                max2 = Math.max(max2, arr[i]);
            }
        }
        return max1 + max2;
    }
}