class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean x = false, y = false, z = false;
        for (int[] t : triplets) {
            int a = t[0];
            int b = t[1];
            int c = t[2];
            if (a <= target[0] && b <= target[1] && c <= target[2]) {
                if (a == target[0])
                    x = true;
                if (b == target[1])
                    y = true;
                if (c == target[2])
                    z = true;
            }
        }
        return x && y && z;
    }
}