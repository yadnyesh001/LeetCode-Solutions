class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int sarr[] = new int[26];
        int parr[] = new int[26];
        for(char ch : p.toCharArray()){
            parr[ch - 'a']++;
        }
        for(int i=0; i<p.length(); i++){
            sarr[s.charAt(i) - 'a']++;
        }
        if(areEqual(sarr, parr)){
            list.add(0);
        }
        int j = 0;
        for(int i=p.length(); i<s.length(); i++){
            sarr[s.charAt(i) - 'a']++;
            sarr[s.charAt(j++) - 'a']--;
            if(areEqual(sarr, parr)){
                list.add(j);
            }
        }
        return list;
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