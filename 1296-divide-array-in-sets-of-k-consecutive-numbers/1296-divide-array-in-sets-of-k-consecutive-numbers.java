class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length % k != 0){
            return false;
        }
        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for(int num : nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        while(!countMap.isEmpty()){
            int first = countMap.firstKey();
            for(int i=0; i<k; i++){
                int current = first + i;
                if(!countMap.containsKey(current)){
                    return false;
                }
                countMap.put(current, countMap.get(current)-1);
                if(countMap.get(current) == 0){
                    countMap.remove(current);
                }
            }
        }
        return true;
    }
}