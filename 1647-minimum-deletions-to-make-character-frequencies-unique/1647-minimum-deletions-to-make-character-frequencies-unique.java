class Solution {
    public int minDeletions(String s) {
        int arr[] = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch - 'a']++;
        }
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<26; i++){
            if(!set.contains(arr[i]) && arr[i] > 0){
                set.add(arr[i]);
            }
            else{
                int x = 0;
                while(set.contains(arr[i]) && arr[i] > 0){
                    arr[i]--;
                    x++;
                }
                if(arr[i] > 0){
                    set.add(arr[i]);
                }
                count = count + x;
            }
        }
        return count;
    }
}