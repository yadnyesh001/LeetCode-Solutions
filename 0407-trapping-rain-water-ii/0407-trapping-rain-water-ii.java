class Solution {
    class Node implements Comparable<Node>{
        int x, y, h;
        Node(int x, int y, int h){
            this.x = x;
            this.y = y;
            this.h = h;
        }
        public int compareTo(Node that){
            return this.h - that.h;
        }
    }
    public int trapRainWater(int[][] heightMap) {
        int n = heightMap.length, m = heightMap[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<Node> heap = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            visited[i][0] = true;
            visited[i][m - 1] = true;
            heap.add(new Node(i, 0, heightMap[i][0]));
            heap.add(new Node(i, m - 1, heightMap[i][m - 1]));
        }
        for(int j = 0; j < m; j++){
            visited[0][j] = true;
            visited[n - 1][j] = true;
            heap.add(new Node(0, j, heightMap[0][j]));
            heap.add(new Node(n - 1, j, heightMap[n - 1][j]));
        }
        int ans = 0;
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        while(!heap.isEmpty()){
            Node cur = heap.poll();
            for(int k = 0; k < 4; k++){
                int x = cur.x + dx[k];
                int y = cur.y + dy[k];
                if(x >= 0 && y >= 0 && x < n && y < m && !visited[x][y]){
                    visited[x][y] = true;
                    ans += Math.max(0, cur.h - heightMap[x][y]);
                    heap.add(new Node(x, y, Math.max(cur.h, heightMap[x][y])));
                }
            }
        }
        return ans;
    }
}