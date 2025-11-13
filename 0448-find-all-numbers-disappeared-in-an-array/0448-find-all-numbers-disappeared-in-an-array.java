class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(!set.contains(i+1)){
                list.add(i+1);
            }
        }
        return list;
    }
}