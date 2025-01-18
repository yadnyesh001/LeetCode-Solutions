class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        int n = arr.length;
        boolean equal = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] != brr[i]) {
                equal = false;
                break;
            }
        }
        if (equal) return 0;
        
        long directCost = 0;
        for (int i = 0; i < n; i++) {
            directCost += Math.abs(arr[i] - brr[i]);
        }
        
        Arrays.sort(arr);
        Arrays.sort(brr);
        
        long rearrangeCost = k;  
        for (int i = 0; i < n; i++) {
            rearrangeCost += Math.abs(arr[i] - brr[i]);
        }
        System.out.println(rearrangeCost);
        return Math.min(directCost, rearrangeCost);
    }
}