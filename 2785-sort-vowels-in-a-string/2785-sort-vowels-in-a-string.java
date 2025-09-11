class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vow = new ArrayList<>();
        String x = "";

        for (int i = 0; i < s.length(); i++) {
            char j = s.charAt(i);
            if (j == 'a' || j == 'e' || j == 'i' || j == 'o' || j == 'u' || j == 'A' || j == 'E' || j == 'I' || j == 'O'
                    || j == 'U')
                vow.add(j);
        }
        Collections.sort(vow);
        Iterator<Character> itr = vow.iterator();

        for (int i = 0; i < s.length(); i++) {
            char j = s.charAt(i);
            if (j == 'a' || j == 'e' || j == 'i' || j == 'o' || j == 'u' || j == 'A' || j == 'E' || j == 'I' || j == 'O'
                    || j == 'U') {
                if (itr.hasNext())
                    x += itr.next();
            } else
                x += s.charAt(i);
        }
        return x;
    }
}