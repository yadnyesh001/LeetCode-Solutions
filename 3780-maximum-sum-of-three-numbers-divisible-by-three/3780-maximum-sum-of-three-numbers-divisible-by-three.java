class Solution {
    public int maximumSum(int[] nums) {
        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 3 == 0){
                zero.add(nums[i]);
            }
            else if(nums[i] % 3 == 1){
                one.add(nums[i]);
            }
            else{
                two.add(nums[i]);
            }
        }
        Collections.sort(zero);
        Collections.sort(one);
        Collections.sort(two);
        int z = zero.size()-1;
        int o = one.size()-1;
        int t = two.size()-1;
        int max = 0;
        if(z > 1){
            max = Math.max(max, zero.get(z) + zero.get(z-1) + zero.get(z-2));
        }
        if(z > -1 && o > -1 && t > -1){
            max = Math.max(max, zero.get(z) + one.get(o) + two.get(t));
        }
        if(o > 1){
            max = Math.max(max, one.get(o) + one.get(o-1) + one.get(o-2));
        }
        if(t > 1){
            max = Math.max(max, two.get(t) + two.get(t-1) + two.get(t-2));
        }
        return max;
    }
}