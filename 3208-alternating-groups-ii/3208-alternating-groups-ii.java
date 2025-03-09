class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n+k-2; i++){
            if(colors[i%n] == colors[(i+1)%n]){
                list.add(i+1);
            }
        }
        if(list.isEmpty()){
            return n;
        }
        int count = 0;
        if(list.get(0) > k-1){
            count += list.get(0) - k + 1;
        }
        for(int i=0; i<list.size()-1; i++){
            int x = list.get(i+1) - list.get(i);
            if(x > k-1){
                count += x - k + 1;
            }
        }
        if(n+k-1 - list.get(list.size()-1) > k-1){
            count += n+k-1 - list.get(list.size()-1) - k + 1;
        }
        return count;
    }
}