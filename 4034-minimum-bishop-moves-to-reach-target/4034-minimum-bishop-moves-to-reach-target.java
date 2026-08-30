class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int a1 = source[0], b1 = source[1];
        int a2 = target[0], b2 = target[1];

        if(a1 == a2 && b1 == b2)
            return 0;
        if(a1 - b1 == a2 - b2 || a1 + b1 == a2 + b2)
            return 1;
        if((a1 + b1) % 2 != (a2 + b2) % 2)
            return -1;
        return 2;
    }
}