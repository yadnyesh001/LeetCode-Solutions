class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=1; i<n; i++){
            min = Math.min(min, arr[i] - arr[i-1]);
        }
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1; i<n; i++){
            if(min == arr[i] - arr[i-1]){
                List<Integer> subList = new ArrayList<>();
                subList.add(arr[i-1]);
                subList.add(arr[i]);
                list.add(subList);
            }
        }
        return list;
    }
}