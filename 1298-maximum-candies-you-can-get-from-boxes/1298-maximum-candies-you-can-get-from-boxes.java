class Solution {
    public int maxCandies(int[] stat, int[] choco, List<List<Integer>> keys, List<List<Integer>> containedBoxes,
            int[] curBoxes) {
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < curBoxes.length; i++) {
            int box_ind = curBoxes[i];
            for (int key : keys.get(box_ind)) {
                stat[key] = 1;
            }
            if (stat[box_ind] == 0)
                dq.addLast(box_ind);
            else
                dq.addFirst(box_ind);
        }

        int ans = 0;

        while (!dq.isEmpty()) {
            int ind = dq.pollFirst();

            if (stat[ind] == 0) {
                break;
            } else if (stat[ind] == 1) {
                ans += choco[ind];
                for (int key : keys.get(ind)) {
                    stat[key] = 1;
                }
            }

            for (int new_box_ind : containedBoxes.get(ind)) {
                if (stat[new_box_ind] == 0)
                    dq.addLast(new_box_ind);
                else
                    dq.addFirst(new_box_ind);
            }
        }

        return ans;
    }
}