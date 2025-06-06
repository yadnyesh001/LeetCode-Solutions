class Solution {
    public String robotWithString(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> t = new Stack<>();
        char[] schar = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            map.put(schar[i], i);
        }
        Arrays.sort(schar);

        int cur = -1;
        int i = 0;
        while (i < s.length()) {
            char curch = schar[i];
            if (map.get(curch) > cur) {
                while (!t.isEmpty() && t.peek() <= curch){
                    ans.append(t.pop());
                }
                ans.append(curch);
                for (int j = cur + 1; j < map.get(curch); j++) {
                    if (s.charAt(j) == curch) {
                        ans.append(curch);
                        i++;
                    } 
                    else{
                        t.push(s.charAt(j));
                    }
                }
                cur = map.get(curch);
            }
            i++;
        }
        while (!t.isEmpty()){
            ans.append(t.pop());
        }
        return ans.toString();
    }
}