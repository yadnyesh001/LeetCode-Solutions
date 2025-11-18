class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }
        for(int prereq[] : prerequisites){
            adj.get(prereq[1]).add(prereq[0]);
        }
        boolean visited[] = new boolean[numCourses];
        boolean recStack[] = new boolean[numCourses];
        for(int i=0; i<numCourses; i++){
            if(!visited[i]){
                if(dfs(i, visited, recStack, adj)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean dfs(int node, boolean visited[], boolean recStack[], List<List<Integer>> adj){
        visited[node] = true;
        recStack[node] = true;

        for(int n : adj.get(node)){
            if(!visited[n]){
                if(dfs(n, visited, recStack, adj)){
                    return true;
                }
            }
            else if(recStack[n]){
                return true;
            }
        }
        recStack[node] = false;
        return false;
    }
}