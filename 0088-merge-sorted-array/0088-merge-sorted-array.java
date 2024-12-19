class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length >= nums2.length){
            int j = 0;
            for(int i=m; i<m+n; i++){
                nums1[i] = nums2[j];
                j++;
            }
            Arrays.sort(nums1);
            return nums1;
        }
        else{
            int j = 0;
            for(int i=n; i<m+n; i++){
                nums2[i] = nums1[j];
                j++;
            }
            Arrays.sort(nums2);
            return nums2;
        }
    }
}