class Solution {
    public int leastInterval(char[] tasks, int n) {
        int arr[] = new int[26];
        int max = 0;
        for(int i=0; i<tasks.length; i++){
            arr[tasks[i] - 'A']++;
            max = Math.max(arr[tasks[i] - 'A'], max);
        }
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == max){
                count++;
            }
        }
        return Math.max(tasks.length, count + (max-1)*(n+1));
    }
}