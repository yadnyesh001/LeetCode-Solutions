class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int x = 0;
        for(int i=0; i<s.length && x<g.length; i++){
            if(g[x] <= s[i]){
                x++;
            }
        }
        return x;
    }
}