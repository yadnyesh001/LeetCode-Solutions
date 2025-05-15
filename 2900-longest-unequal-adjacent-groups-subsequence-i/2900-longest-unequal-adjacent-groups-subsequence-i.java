class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> list1 = new ArrayList<>();
        int n = groups.length;
        boolean abc = true;
        for(int i=0; i<n; i++){
            if(abc && (groups[i] == 0)){
                abc = false;
                list1.add(words[i]);
            }
            if(!abc && (groups[i] == 1)){
                abc = true;
                list1.add(words[i]);
            }
        }
        List<String> list2 = new ArrayList<>();
        abc = true;
        for(int i=0; i<n; i++){
            if(abc && (groups[i] == 1)){
                abc = false;
                list2.add(words[i]);
            }
            if(!abc && (groups[i] == 0)){
                abc = true;
                list2.add(words[i]);
            }
        }
        if(list1.size() > list2.size()){
            return list1;
        }
        else{
            return list2;
        }
    }
}