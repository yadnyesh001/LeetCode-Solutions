class Solution {
    public int minDeletion(String s, int k) {
        int arr[] = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch - 'a']++;
        }
        Arrays.sort(arr);
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                count++;
            }
        }
        if(count == k){
            return 0;
        }
        else if(count < k){
            return 0;
        }
        int ans = 0;
        int x = 0;
        while(count != k){
            if(arr[x] > 0){
                ans = ans + arr[x];
                arr[x] = 0;
                count--;
            }
            x++;
        }
        return ans;
    }
}