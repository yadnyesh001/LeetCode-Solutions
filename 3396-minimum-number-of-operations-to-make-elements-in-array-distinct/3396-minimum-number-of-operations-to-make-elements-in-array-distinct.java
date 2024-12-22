class Solution {
    public int minimumOperations(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        
        int operations = 0;
        while (list.size() > 0) {
            if (isDistinct(list)) {
                break;
            }
            
            int elementsToRemove = Math.min(3, list.size());
            for (int i = 0; i < elementsToRemove; i++) {
                list.remove(0);
            }
            operations++;
        }
        
        return operations;
    }
    
    private boolean isDistinct(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return set.size() == list.size();
    }
}