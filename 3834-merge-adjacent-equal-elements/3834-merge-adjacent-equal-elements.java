class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> st = new ArrayList<>();
        for (long num : nums) {
            while (!st.isEmpty() && st.get(st.size() - 1) == num){
                num += st.remove(st.size() - 1);
            }
            st.add(num);
        }
        return st;
    }
}