class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int arr[] = new int[n+3-1];
        for(int i=0; i<n; i++){
            arr[i] = colors[i];
        }
        for(int i=n; i<arr.length; i++){
            arr[i] = colors[i-n];
        }
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for(int i=1; i<arr.length-1; i++){
            if(arr[i] == 1 && (arr[i-1] == 0 && arr[i+1] == 0)){
                count++;
            }
            else if(arr[i] == 0 && (arr[i-1] == 1 && arr[i+1] == 1)){
                count++;
            }
        }
        return count;
    }
}