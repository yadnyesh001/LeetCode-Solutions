class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            int x = n % 10;
            list.add(x);
            n = n/10;
        }
        int max = 0;
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                max = Math.max(max, list.get(i)*list.get(j));
            }
        }
        return max;
    }
}