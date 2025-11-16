class Solution {
    public int minLengthAfterRemovals(String s) {
        int a = 0;
        int b = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'a'){
                a++;
            }
            else{
                b++;
            }
        }
        return s.length() - 2*Math.min(a,b);
    }
}