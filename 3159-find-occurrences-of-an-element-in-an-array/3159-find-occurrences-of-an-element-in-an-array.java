class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int arr[] = new int[queries.length];
        int newnums[] = new int[nums.length];
        int j = 0;
        for(int i=0; i<nums.length; i++){
            newnums[i] = -1;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] == x){
                newnums[j] = i;
                j++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(queries[i] >= arr.length){
                arr[i] = -1;
            }
            else{
                arr[i] = newnums[queries[i]-1];
            }
        }
        return arr;
    }
}