class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        long count = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            int left = i+1;
            int min = minIndex(nums, left, nums.length-1, lower - nums[i]);
            int max = maxIndex(nums, left, nums.length-1, upper - nums[i]);

            if(min != -1 && max != -1 && min <= max){
                count = count + max - min +1;
            }
        }
        return count;
    }

    public int minIndex(int nums[], int left, int right, int sum){
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] >= sum){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        if(left >= nums.length){
            return -1;
        }
        return left;
    }

    public int maxIndex(int nums[], int left, int right, int sum){
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] <= sum){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        if(right < 0){
            return -1;
        }
        return right;
    }
}