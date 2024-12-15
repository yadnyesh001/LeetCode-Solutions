class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int max = events[0][1]; 
        int longestButton = events[0][0];
        int prevTime = events[0][1]; 
        
        for (int i = 1; i < events.length; i++) {
            int currentButton = events[i][0];
            int currentTime = events[i][1];
            int timeInterval = currentTime - prevTime; 
            
            if (timeInterval > max || (timeInterval == max && currentButton < longestButton)) {
                max = timeInterval; 
                longestButton = currentButton;
            }  
            prevTime = currentTime; 
        }
        return longestButton; 
    }
}
