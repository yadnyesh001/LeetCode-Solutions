class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftMax[] = new int[n+2];
        int rightMax[] = new int[n+2];
        for(int i=0; i<n; i++){
            leftMax[i+1] = Math.max(leftMax[i], height[i]);
        }
        for(int i=n-1; i>=0; i--){
            rightMax[i+1] = Math.max(rightMax[i+2], height[i]);
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            int curr = Math.min(leftMax[i], rightMax[i+1]) - height[i];
            if(curr > 0){
                sum = sum + curr;
            } 
        }
        return sum;
    }
}