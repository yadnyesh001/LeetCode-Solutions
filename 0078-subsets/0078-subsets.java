class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        result.add(new ArrayList<>());
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public void backtrack(int nums[], int start, List<Integer> list, List<List<Integer>> result){
        if(list.size() > 0){
            result.add(new ArrayList<>(list));
        }
        for(int i=start; i<nums.length; i++){
            list.add(nums[i]);
            backtrack(nums, i+1, list, result);
            list.remove(list.size()-1);
        }
    }
}