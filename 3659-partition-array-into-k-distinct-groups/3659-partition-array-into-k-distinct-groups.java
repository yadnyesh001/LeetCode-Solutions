class Solution {
    public boolean partitionArray(int[] nums, int k) {
        if(nums.length % k != 0){
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int maxFreq = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
            }
        }
        if(maxFreq > nums.length/k){
            return false;
        }
        return true;
    }
}