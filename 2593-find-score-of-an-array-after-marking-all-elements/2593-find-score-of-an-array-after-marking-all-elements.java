class Solution {
    public long findScore(int[] nums) {
        long sum = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });
        Set<Integer> visited = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            pq.add(new int[]{nums[i], i});
        } 

        while(!pq.isEmpty()){
            int current[] = pq.poll();
            int val = current[0];
            int index = current[1];

            if(visited.contains(index)){
                continue;
            }
            sum = sum + val;
            visited.add(index);
            if(index > 0){
                visited.add(index - 1);
            }
            if(index < nums.length-1){
                visited.add(index + 1);
            }
        }
        return sum;
    }
}