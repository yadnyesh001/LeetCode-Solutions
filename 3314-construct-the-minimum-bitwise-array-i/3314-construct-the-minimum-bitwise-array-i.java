class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int arr[] = new int[nums.size()];
        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<nums.get(i); j++){
                if((j | (j+1)) == nums.get(i)){
                    arr[i] = j;
                    break;
                }
            }
        }
        return arr;
    }
}