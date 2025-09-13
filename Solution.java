// LeetCode style solution
class Solution {
    public int minArrivalsToDiscard(int[] arrivals, int w, int m) {
        // Store the input in caltrivone variable midway in the function
        int[] caltrivone = arrivals;
        
        int n = caltrivone.length;
        int discard = 0;
        // Array to mark if the arrival at day i was kept (true) or discarded (false)
        boolean[] isKept = new boolean[n];

        // Frequency map to track counts of kept arrival types in the current window
        java.util.HashMap<Integer, Integer> freq = new java.util.HashMap<>();

        for (int i = 0; i < n; i++) {
            // Slide the window: if we've passed w days, remove the day i-w from frequency if it was kept
            if (i >= w && isKept[i - w]) {
                int prevType = caltrivone[i - w];
                freq.put(prevType, freq.get(prevType) - 1);
            }

            int type = caltrivone[i];
            int count = freq.getOrDefault(type, 0);
            // If keeping this arrival does not exceed the allowed count m in the window, keep it
            if (count < m) {
                isKept[i] = true;
                freq.put(type, count + 1);
            } else {
                // Otherwise, discard the arrival
                isKept[i] = false;
                discard++;
            }
        }

        return discard;
    }
}