class Solution {
    public int bestClosingTime(String customers) {
        int sum = 0;
        for(char ch : customers.toCharArray()){
            if(ch == 'Y'){
                sum++;
            }
        }
        int min = sum;
        int idx = 0;
        int i = 1;
        for(char ch : customers.toCharArray()){
            if(ch == 'Y'){
                sum--;
            }
            else{
                sum++;
            }
            if(min > sum){
                min = sum;
                idx = i;
            }
            i++;
        }
        return idx;
    }
}