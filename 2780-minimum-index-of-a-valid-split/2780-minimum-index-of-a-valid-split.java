class Solution {
    public int minimumIndex(List<Integer> nums) {
        int freqElement = majorityElement(nums);
        int totalCount = 0;
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i) == freqElement){
                totalCount++;
            }
        }
        int leftCount = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == freqElement) {
                leftCount++;
            }
            if (leftCount * 2 > (i + 1) && (totalCount - leftCount) * 2 > (nums.size() - i - 1)) {
                return i;
            }
        }
        return -1;
    }

    public int majorityElement(List<Integer> nums) {
        int num = 0;
        int count = 0;
        for(int i=0; i< nums.size(); i++){
            if(count == 0){
                num = nums.get(i);
            }
            if(num == nums.get(i)){
                count++;
            }
            else{
                count--;
            }
        }
        return num;
    }
}