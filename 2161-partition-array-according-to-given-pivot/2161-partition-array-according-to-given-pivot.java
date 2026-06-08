class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == pivot){
                count++;
            }
            else if(nums[i] < pivot){
                st.push(nums[i]);
            }
            else{
                list.add(nums[i]);
            }
        }
        for(int i=0; i<count; i++){
            list.add(0, pivot);
        }
        while(!st.isEmpty()){
            list.add(0, st.pop());
        }
        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}