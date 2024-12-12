class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<gifts.length; i++){
            pq.add(gifts[i]);
        }
        for(int i=0; i<k; i++){
            int add = (int)Math.sqrt(pq.poll());
            pq.add(add);
        }
        int sum = 0;
        for(int i=0; i<gifts.length; i++){
            sum = sum + pq.poll();
        }
        return sum;
    }
}