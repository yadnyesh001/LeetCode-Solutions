class Solution {
    public int takeCharacters(String s, int k) {
        int count = 0;
        int acount = 0;
        int bcount = 0;
        int ccount = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                acount++;
            }
            if(s.charAt(i) == 'b'){
                bcount++;
            }
            if(s.charAt(i) == 'c'){
                ccount++;
            }
        }
        if(acount < k || bcount < k || ccount < k){
            return -1;
        }
        int x = 0;
        int ans = 0;
        int y = 0;
        while (y < s.length()) {
            if (s.charAt(y) == 'a') {
                acount--;
            } else if (s.charAt(y) == 'b') {
                bcount--;
            } else if (s.charAt(y) == 'c') {
                ccount--;
            }

            y++;
            while (acount < k || bcount < k || ccount < k) {
                if (s.charAt(x) == 'a') {
                    acount++;
                } else if (s.charAt(x) == 'b') {
                    bcount++;
                } else if (s.charAt(x) == 'c') {
                    ccount++;
                }
                x++;
            }

            ans = Math.max(ans, y - x);
        }
        return s.length() - ans;
    }
}