class Solution {
    public int[] sortArray(int[] nums) {
        int arr[] = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            arr[i] = pq.poll();
        }
        return arr;
    }
}