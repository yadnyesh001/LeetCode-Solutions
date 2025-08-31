class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int arr[] = new int[friends.length];
        int x = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<friends.length; i++){
            set.add(friends[i]);
        }
        for(int i=0; i<order.length; i++){
            if(set.contains(order[i])){
                arr[x++] = order[i];
            }
        }
        return arr;
    }
}