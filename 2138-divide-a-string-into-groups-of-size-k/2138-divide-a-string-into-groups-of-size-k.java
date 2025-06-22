class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int x = n / k;
        int y = n % k;
        int l = 0;
        if(y > 0){
            l = x+1;
        }
        else{
            l = x;
        }
        String arr[] = new String[l];
        for(int i=0; i<x; i++){
            arr[i] = s.substring(i*k, (i+1)*k);
        }
        if(y > 0){
            StringBuilder res = new StringBuilder();
            res.append(s.substring((x)*k, s.length()));
            for(int i=0; i<(k-y); i++){
                res.append(fill);
            }
            arr[l-1] = res.toString();
        }
        return arr;
    }
}