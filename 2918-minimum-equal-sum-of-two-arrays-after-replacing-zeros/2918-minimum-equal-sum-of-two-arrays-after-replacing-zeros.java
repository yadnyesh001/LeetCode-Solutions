class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0;
        int zeros1 = 0;
        long sum2 = 0;
        int zeros2 = 0;
        for(int i=0; i<nums1.length; i++){
            sum1 += nums1[i];
            if(nums1[i] == 0){
                zeros1++;
            }
        }        
        for(int i=0; i<nums2.length; i++){
            sum2 += nums2[i];
            if(nums2[i] == 0){
                zeros2++;
            } 
        }
        long min1 = sum1 + zeros1;
        long min2 = sum2 + zeros2;
        if(zeros1 == 0 && zeros2 == 0){
            return sum1 == sum2 ? sum1 : -1;
        }
        else if(zeros1 == 0){
            return sum2 + zeros2 <= sum1 ? sum1 : -1;
        }
        else if(zeros2 == 0){
            return sum1 + zeros1 <= sum2 ? sum2 : -1;
        }
        return Math.max(min1, min2);
    }
}