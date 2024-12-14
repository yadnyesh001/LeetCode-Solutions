class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Float> pq = new PriorityQueue<>((a, b) -> Float.compare(b, a));
        float sum = 0;
        for (int num : nums) {
            pq.add((float) num);
            sum += num;
        }
        float halfSum = 0;
        int count = 0;
        while (halfSum < sum / 2) {
            float largest = pq.poll();
            float reduced = largest / 2;
            halfSum += reduced;
            pq.add(reduced);
            count++;
        }
        return count;
    }
}
