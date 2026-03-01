class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for(int i=0; i<n.length(); i++){
            if(max < n.charAt(i) - '0'){
                max = n.charAt(i) - '0';
            }
        }
        return max;
    }
}