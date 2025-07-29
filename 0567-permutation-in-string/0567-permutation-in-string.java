class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()){
            return false;
        }
        int s1arr[] = new int[26];
        int s2arr[] = new int[26];
        for(int i=0; i<s1.length(); i++){
            s1arr[s1.charAt(i) - 'a']++;
            s2arr[s2.charAt(i) - 'a']++;
        }
        if(areEqual(s1arr, s2arr)){
            return true;
        }
        int j = 0;
        for(int i=s1.length(); i<s2.length(); i++){
            s2arr[s2.charAt(i) - 'a']++;
            s2arr[s2.charAt(j++) - 'a']--;
            if(areEqual(s1arr, s2arr)){
                return true;
            }
        }
        return false;
    }

    public boolean areEqual(int sarr[], int parr[]){
        for(int i=0; i<26; i++){
            if(sarr[i] != parr[i]){
                return false;
            }
        }
        return true;
    }
}