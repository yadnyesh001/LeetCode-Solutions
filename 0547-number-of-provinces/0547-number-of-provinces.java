class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean visited[] = new boolean[isConnected.length];
        int count = 0;
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                dfs(i, isConnected, visited);
                count++;
            }
        }
        return count;
    }

    public void dfs(int node, int[][] isConnected, boolean[] visited) {
        visited[node] = true;
        for (int neighbor = 0; neighbor < isConnected.length; neighbor++) {
            if (isConnected[node][neighbor] == 1 && !visited[neighbor]) {
                dfs(neighbor, isConnected, visited);
            }
        }
    }
}