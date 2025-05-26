class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int arr[] = new int[nums.length-k+1];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<k; i++){
            pq.add(nums[i]);
        }
        arr[0] = pq.peek();
        for(int i=k; i<nums.length; i++){
            pq.add(nums[i]);
            pq.remove(nums[i-k]);
            arr[i-k+1] = pq.peek();
        }
        return arr;
    }
}