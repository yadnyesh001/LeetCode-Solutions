class Solution {
    public long minimumDifference(int[] nums) {
        int x = (nums.length/3) * 2;
        PriorityQueue<Integer> front = new PriorityQueue<>();
        PriorityQueue<Integer> back = new PriorityQueue<>(Collections.reverseOrder());
        long ans = Long.MAX_VALUE;
        for(int i=0; i<x; i++){
            front.add(nums[i]);
        }
        for(int i=nums.length-1; i>=nums.length/2; i--){
            back.add(nums[i]);
        }
        long f = 0;
        long b = 0;
        for(int i=0; i<nums.length/3; i++){
            f += front.poll();
            b += back.poll();
        }
        return f-b;
    }
}