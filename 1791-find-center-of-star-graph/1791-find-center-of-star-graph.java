class Solution {
    public int findCenter(int[][] edges) {
        int x = 0;
        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]){
            x = edges[0][0];
        }
        if(edges[0][1] == edges[1][0] || edges[0][1] == edges[1][1]){
            x = edges[0][1];
        }
        return x;
    }
}