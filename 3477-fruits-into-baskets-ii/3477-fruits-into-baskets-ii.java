class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<fruits.length; i++){
            for(int j=0; j<fruits.length; j++){
                if(!set.contains(j) && fruits[i] <= baskets[j]){
                    set.add(j);
                    count++;
                    break;
                }
            }
        }
        return fruits.length - count;
    }
}