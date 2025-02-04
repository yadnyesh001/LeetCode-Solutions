class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int arr[] = new int[spells.length];
        Arrays.sort(potions);
        for(int i=0; i<spells.length; i++){
            int start = 0;
            int end = potions.length-1;
            while(start <= end){
                int mid = start + (end-start)/2;
                long product = (long)spells[i] * potions[mid];
                if(product >= success){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }
            }
            arr[i] = potions.length-start;
        }
        return arr;
    }
}