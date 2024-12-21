class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max = candies[0];
        for (int i = 1; i < n; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        List<Boolean> boolarray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= max) {
                boolarray.add(true);
            } else {
                boolarray.add(false);
            }
        }
        return boolarray;
    }
}
