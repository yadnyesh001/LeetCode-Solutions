class Solution {
    public int magnificentSets(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        boolean[] visited = new boolean[n + 1];
        List<List<Integer>> components = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                dfs(i, adj, visited, component);
                components.add(component);
            }
        }
        
        int result = 0;
        
        for (List<Integer> component : components) {
            int maxGroups = -1;
            
            for (int start : component) {
                int groups = bfs(start, adj, n);
                maxGroups = Math.max(maxGroups, groups);
            }
            
            if (maxGroups == -1) {
                return -1;
            }
            result += maxGroups;
        }
        
        return result;
    }
    
    private void dfs(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> component) {
        visited[node] = true;
        component.add(node);
        
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, component);
            }
        }
    }
    
    private int bfs(int start, List<List<Integer>> adj, int n) {
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> groups = new HashMap<>();
        queue.offer(start);
        groups.put(start, 1);
        int maxGroup = 1;
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            int currentGroup = groups.get(node);
            
            for (int neighbor : adj.get(node)) {
                if (!groups.containsKey(neighbor)) {
                    groups.put(neighbor, currentGroup + 1);
                    maxGroup = Math.max(maxGroup, currentGroup + 1);
                    queue.offer(neighbor);
                } else if (Math.abs(groups.get(neighbor) - currentGroup) != 1) {
                    return -1;
                }
            }
        }
        
        return maxGroup;
    }
}