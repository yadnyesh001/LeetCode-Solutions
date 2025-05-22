class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j] && !set.contains(nums1[i])){
                    set.add(nums1[i]);
                    list.add(nums2[j]);
                }
            }
        }
        int n = list.size();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}