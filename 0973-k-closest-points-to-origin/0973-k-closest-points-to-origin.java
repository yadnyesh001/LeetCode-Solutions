class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(
                Math.sqrt(Math.pow(a[0], 2) + Math.pow(a[1], 2)),
                Math.sqrt(Math.pow(b[0], 2) + Math.pow(b[1], 2))
            )
        );
        for (int[] point: points) {
            pq.add(point);
        }

        int[][] closest = new int[k][2];
        for (int i = 0; i < k; i++) {
            closest[i] = pq.remove();
        }

        return closest;
    }
}
