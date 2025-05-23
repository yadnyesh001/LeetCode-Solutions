class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = sortStringCharacters(strs[i]);
            map.computeIfAbsent(s, k -> new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }

    public static String sortStringCharacters(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}