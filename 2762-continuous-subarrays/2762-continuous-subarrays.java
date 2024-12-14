class Solution {
    public long continuousSubarrays(int[] nums) {
        PriorityQueue<Integer> max = new PriorityQueue<>((a, b) -> b-a);
        PriorityQueue<Integer> min = new PriorityQueue<>();
        long count = 0;
        int start = 0;
        for(int i=0; i<nums.length; i++){
            max.add(nums[i]);
            min.add(nums[i]);
            while(max.peek() - min.peek() > 2){
                max.remove(nums[start]);
                min.remove(nums[start]);
                start++;
            }
            count = count + i - start + 1;
        }
        return count;
    }
}