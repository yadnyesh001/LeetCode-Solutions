class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arr[] = new int[k];
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );
        pq.addAll(frequencyMap.entrySet());
        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            arr[i] = (pq.poll().getKey());
        }
        return arr;
    }
}