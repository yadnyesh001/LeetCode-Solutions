class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            while(nums[i] > 0){
                int x = nums[i] % 10;
                list.add(idx, x);
                nums[i] = nums[i]/10;
            }
            idx = list.size();
        }
        int size = list.size();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}