class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if(k == 1){
            return true;
        }
        int index = 0;
        int count = 1;
        for(int i=0; i<nums.size()-1; i++){
            if(count >= k){
                index = i;
                int sum = 1;
                for(int j=index+1; j<nums.size()-1; j++){
                    if(nums.get(j) < nums.get(j+1)){
                        sum++;
                    }
                    else{
                        break;
                    }
                    if(sum == k){
                        return true;
                    }
                }
            }
            if(nums.get(i) < nums.get(i+1)){
                count++;
            }
            else{
                count = 1;
            }
        }
        return false;
    }
}