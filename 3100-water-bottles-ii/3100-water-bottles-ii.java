class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int count = numBottles;
        int emptyBottles = numBottles;
        numBottles = 0;
        while(numBottles != 0 || numExchange <= emptyBottles){
            if(emptyBottles >= numExchange){
                emptyBottles -= numExchange;
                numBottles++;
                numExchange++;
            }
            else{  
                count += numBottles;
                emptyBottles += numBottles;
                numBottles = 0;
            }
        }
        return count;
    }
}