class Solution {
    public int maxRemoval(int[] nums, int[][] queries) {
        Arrays.sort(queries, (a, b) -> a[0] - b[0]);
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int[] ends = new int[nums.length + 1];
        int operations = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            operations += ends[i];
            while (j < queries.length && queries[j][0] == i) {
                pq.offer(queries[j++][1]);
            }
            while (operations < nums[i] && !pq.isEmpty() && pq.peek() >= i) {
                operations++;
                ends[pq.poll() + 1]--;
            }
            if (operations < nums[i]) {
                return -1;
            }
        }
        return pq.size();
    }
}