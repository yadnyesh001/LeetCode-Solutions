class Solution {
    public int trap(int[] height) {
        int sum = 0;
        int water = 0;
        int count = 0;
        int maxindex = 0;
        int max = height[0];

        for(int i=1; i<height.length; i++){
            if(max < height[i]){
                maxindex = i;
                max = height[i];
            }
        }
        int current = height[0];
        for(int i=1; i<=maxindex; i++){
            if(height[i] >= current){
                water = water + Math.min(height[i], current)*count - sum;
                System.out.println(water);
                current = height[i]; 
                sum = 0;
                count = 0;
            }
            else{
                sum = sum + height[i];
                count++;
            }
        }

        sum = 0;
        count = 0;
        current = height[height.length-1];
        for(int i=height.length-2; i>=maxindex; i--){
            if(height[i] >= current){
                water = water + Math.min(height[i], current)*count - sum;
                System.out.println(water);
                current = height[i];
                sum = 0;
                count = 0;
            }
            else{
                sum = sum + height[i];
                count++;
            }
        }

        return water;
    }
}