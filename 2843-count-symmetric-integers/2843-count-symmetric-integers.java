class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low; i<=high; i++){
            String s = i + "";
            if(s.length() % 2 == 0){
                int left = 0;
                int right = 0;
                for(int j=0; j<s.length()/2; j++){
                    left = left + (s.charAt(j) - '0');
                    right = right + (s.charAt(s.length()-j-1) - '0');
                }
                if(left == right){
                    count++;
                }
            }
        }   
        return count;
    }
}