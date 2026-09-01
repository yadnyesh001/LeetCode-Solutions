class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++){
            min = Math.min(arr[i] - arr[i-1], min);
        }
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1; i<arr.length; i++){
            if(arr[i] - arr[i-1] == min){
                List<Integer> sublist = new ArrayList<>();
                sublist.add(arr[i-1]);
                sublist.add(arr[i]);
                list.add(sublist);
            }
        }
        return list;
    }
}