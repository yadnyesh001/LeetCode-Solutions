class Solution {
    public int[] minOperations(String boxes) {
        int arr[] = new int[boxes.length()];
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr.length; j++){
                if(boxes.charAt(j) == '1'){
                    sum = sum + Math.abs(j-i);
                }
                arr[i] = sum;
            }
        }
        return arr;
    }
}