class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> Double.compare(gain(b[0], b[1]), gain(a[0], a[1])));
        for (int[] c : classes) {
            pq.offer(new int[] { c[0], c[1] });
        }
        while (extraStudents-- > 0) {
            int[] cur = pq.poll();
            cur[0]++;
            cur[1]++;
            pq.offer(cur);
        }
        double sum = 0.0;
        while (!pq.isEmpty()) {
            int[] c = pq.poll();
            sum += (double) c[0] / c[1];
        }
        return sum / classes.length;
    }

    private double gain(int p, int t) {
        return (double) (p + 1) / (t + 1) - (double) p / t;
    }
}
