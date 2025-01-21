class Solution {
    public int bestClosingTime(String customers) {
        int index = 0;
        int countn = 0;
        int county = 0;
        for(char ch : customers.toCharArray()){
            if(ch == 'Y'){
                county++;
            }
        }
        int sum = 0;
        int indexsum = county;
        for(int i=0; i<=customers.length(); i++){
            if(i > 0 && customers.charAt(i-1) == 'N'){
                countn++;
            }
            if(i > 0 && customers.charAt(i-1) == 'Y'){
                county--;
            }
            sum = county + countn;
            if(sum < indexsum){
                indexsum = sum;
                index = i;
            }
        }
        return index;
    }
}