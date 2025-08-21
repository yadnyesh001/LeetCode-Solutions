class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }
        int count = 1;
        int max = 1;
        int x = pq.poll();
        while(!pq.isEmpty()){
            int y = pq.poll();
            if(y == x+1){
                count++;
                max = Math.max(max, count);
            }
            else if (x != y) {
                count = 1;
            }
            x = y;
        }
        return max;
    }
}