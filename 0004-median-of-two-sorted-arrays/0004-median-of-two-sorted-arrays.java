class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double nums[] = new double[nums1.length + nums2.length];
        for(int i=0; i<nums1.length; i++){
            nums[i] = nums1[i];
        }
        int i = 0;
        for(int j=nums1.length; j<nums1.length + nums2.length; j++){
            nums[j] = nums2[i];
            i++;
        }
        Arrays.sort(nums);
        if(nums.length % 2 != 0){
            return nums[nums.length/2];
        }
        double median = (nums[nums.length/2] + nums[(nums.length-1)/2])/2;
        return median;
    }
}