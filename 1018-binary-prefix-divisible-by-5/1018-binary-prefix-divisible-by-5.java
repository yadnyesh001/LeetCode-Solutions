class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        int x = 0;
        for(int i=0; i<nums.length; i++){
            x = (x*2 + nums[i]) % 10;
            list.add(x == 5 || x == 0);
        }
        return list;
    }
}