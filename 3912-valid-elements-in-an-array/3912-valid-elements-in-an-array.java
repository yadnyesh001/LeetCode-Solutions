class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(max < nums[i]){
                max = nums[i];
                arr1[i] = 1;
            }
        }
        max = Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--){
            if(max < nums[i]){
                max = nums[i];
                arr2[i] = 1;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr1[i] == 1 || arr2[i] == 1){
                list.add(nums[i]);
            }
        }
        return list;
    }
}