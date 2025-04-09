class Solution {
    public int lastStoneWeightII(int[] stones) {
        Arrays.sort(stones);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<stones.length-1; i++){
            pq.add(stones[i+1] - stones[i]);
        }
        while(pq.size() > 1){
            int x = pq.poll();
            int y = pq.poll();
            pq.add(Math.abs(x-y));
        }
        return pq.peek();
    }
}