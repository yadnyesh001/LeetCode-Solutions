class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<List<Integer>> graph = buildGraph(numCourses, prerequisites);
        boolean[][] reachable = computeReachability(numCourses, graph);
        
        List<Boolean> answer = new ArrayList<>();
        for (int[] query : queries) {
            answer.add(reachable[query[0]][query[1]]);
        }
        return answer;
    }
    
    private List<List<Integer>> buildGraph(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] prereq : prerequisites) {
            graph.get(prereq[0]).add(prereq[1]);
        }
        return graph;
    }
    
    private boolean[][] computeReachability(int numCourses, List<List<Integer>> graph) {
        boolean[][] reachable = new boolean[numCourses][numCourses];
        
        for (int start = 0; start < numCourses; start++) {
            boolean[] visited = new boolean[numCourses];
            dfs(start, start, graph, reachable, visited);
        }
        return reachable;
    }
    
    private void dfs(int start, int curr, List<List<Integer>> graph, boolean[][] reachable, boolean[] visited) {
        if (visited[curr]) return;
        
        visited[curr] = true;
        reachable[start][curr] = true;
        
        for (int next : graph.get(curr)) {
            dfs(start, next, graph, reachable, visited);
        }
    }
}