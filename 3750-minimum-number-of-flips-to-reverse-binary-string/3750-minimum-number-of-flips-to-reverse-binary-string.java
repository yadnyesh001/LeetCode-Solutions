class Solution {
    public int minimumFlips(int n) {
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            list.add(n%2);
            n = n/2;
        }
        int count = 0;
        for(int i=0; i<list.size()/2; i++){
            if(list.get(i) != list.get(list.size()-i-1)){
                count = count + 2;
            }
        }
        return count;
    }
}