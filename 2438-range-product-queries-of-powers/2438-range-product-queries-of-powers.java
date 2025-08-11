class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int mod = 1000000007;
        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> powers = new ArrayList<Integer>();
        while (n > 0) {
            arr.add((int) n % 2);
            n /= 2;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 1) {
                int t = (int) Math.pow(2, i);
                powers.add(t);
            }
        }
        int result[] = new int[queries.length];
        int j = 0;
        for (int[] a : queries) {
            long res = 1;
            for (int i = a[0]; i <= a[1]; i++) {
                res = (res * powers.get(i) % mod);
            }
            result[j++] = (int) res % mod;
        }
        return result;
    }
}