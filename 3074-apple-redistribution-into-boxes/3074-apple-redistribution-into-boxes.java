class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(apple);
        Arrays.sort(capacity);
        int sum = 0;
        for(int i=0; i<apple.length; i++){
            sum += apple[i];
        }
        int count = 0;
        for(int i=0; i<capacity.length; i++){
            sum = sum - capacity[capacity.length-i-1];
            count++;
            if(sum <= 0){
                break;
            }
        }
        return count;
    }
}