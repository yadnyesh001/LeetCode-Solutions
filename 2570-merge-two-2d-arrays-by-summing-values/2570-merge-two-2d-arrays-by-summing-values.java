class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<nums1.length; i++){
            map.put(nums1[i][0], nums1[i][1]);
        }
        for(int i=0; i<nums2.length; i++){
            map.put(nums2[i][0], map.getOrDefault(nums2[i][0], 0) + nums2[i][1]);
        }
        int n = map.size();
        int arr[][] = new int[n][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arr[index][0] = entry.getKey();
            arr[index][1] = entry.getValue();
            index++;
        }
        return arr;
    }
}