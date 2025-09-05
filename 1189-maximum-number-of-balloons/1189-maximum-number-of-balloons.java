class Solution {
    public int maxNumberOfBalloons(String text) {
        int arr[] = new int[26];
        for(char ch : text.toCharArray()){
            arr[ch-'a']++;
        }
        int min = Integer.MAX_VALUE;
        int x = arr[0];
        min = Math.min(min, x);
        x = arr[1];
        min = Math.min(min, x);
        x = arr[11]/2;
        min = Math.min(min, x);
        x = arr[14]/2;
        min = Math.min(min, x);
        x = arr[13];
        min = Math.min(min, x);
        return min;
    }
}