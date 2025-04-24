class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                count++;
            }
        }
        int res = 0;
        for(int i=0; i<nums.length; i++){
            int ans = 0;
            Set<Integer> abc = new HashSet<>();
            for(int j=i; j<nums.length; j++){
                if(ans < count && !abc.contains(nums[j])){
                    abc.add(nums[j]);
                    ans++;
                    if(ans == count){
                        res++;
                    }
                }
                else if(ans == count && abc.contains(nums[j])){
                    res++;
                }
                else if(ans == count && !abc.contains(nums[j])){
                    break;
                }
            }
        }
        return res;
    }
}