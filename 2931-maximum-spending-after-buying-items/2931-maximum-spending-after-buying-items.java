class Solution {
    public long maxSpending(int[][] values) {
        long sum = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i=0; i<values.length; i++){
            for(int j=0; j<values[0].length; j++){
                pq.add((long)values[i][j]);
            }
        }
        int i = 1;
        while(!pq.isEmpty()){
            sum = sum + i*pq.poll();
            System.out.println(sum);
            i++;
        }
        return sum;
    }
}