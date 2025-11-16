class Solution {
    public int numSub(String s) {
        long sum = 0;
        long count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
            else{
                sum = sum + count*(count+1)/2;
                count = 0;
            }
        }
        sum = sum + count*(count+1)/2;
        return (int)(sum % 1000000007);
    }
}