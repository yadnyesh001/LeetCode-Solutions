class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                list.add(grid[i][j]);
            }
        }
        Collections.sort(list);
        int sum = 0;
        int median = list.get(list.size()/2);
        for(int i=0; i<list.size(); i++){
            if(Math.abs(list.get(i) - median) % x != 0){
                return -1;
            }
            else{
                sum = sum + Math.abs(list.get(i) - median)/x;
            }
        }
        return sum;
    }
}