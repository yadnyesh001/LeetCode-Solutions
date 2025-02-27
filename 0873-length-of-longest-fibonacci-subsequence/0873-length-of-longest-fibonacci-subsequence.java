class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x = arr[i];
                int y = arr[j];
                int len = 2; 
                while (set.contains(x + y)) {
                    len++;
                    int temp = y;
                    y = x + y; 
                    x = temp; 
                }
                max = Math.max(max, len);
            }
        }
        return max > 2 ? max : 0; 
    }
}
