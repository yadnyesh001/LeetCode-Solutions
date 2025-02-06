class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length; 
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int x = nums[i] * nums[j];
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }
        int count = 0;
        for(Integer abc : map.values()){
            count += (abc * (abc - 1) / 2) * 8;
        }
        return count;
    }
}