class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        int x = 0;
        Set<Integer> set = new HashSet<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=nums.length-1; i>=0; i--){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                pq.add(nums[i]);
            }
            if(set.size() == k){
                break;
            }
        }
        int arr[] = new int[set.size()];
        for(int i=0; i<arr.length; i++){
            arr[arr.length-i-1] = pq.poll();
        }
        return arr;
    }
}