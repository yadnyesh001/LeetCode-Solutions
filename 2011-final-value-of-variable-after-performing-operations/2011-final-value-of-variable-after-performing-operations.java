class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i=0; i<operations.length; i++){
            if("--X".equals(operations[i]) || "X--".equals(operations[i])){
                x = x - 1;
            }
            if("++X".equals(operations[i]) || "X++".equals(operations[i])){
                x = x + 1;
            }
        }
        return x;
    }
}