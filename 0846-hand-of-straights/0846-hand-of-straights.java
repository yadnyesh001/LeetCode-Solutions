class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }
        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for (int card : hand) {
            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
        }
        while (!countMap.isEmpty()) {
            int first = countMap.firstKey(); 
            for (int i = 0; i < groupSize; i++) {
                int current = first + i;
                if (!countMap.containsKey(current)) {
                    return false; 
                }
                countMap.put(current, countMap.get(current) - 1);
                if (countMap.get(current) == 0) {
                    countMap.remove(current);
                }
            }
        }
        return true;
    }
}
