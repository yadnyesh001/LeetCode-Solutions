class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> ans = new HashSet<>();
        for(int i=0; i<banned.length; i++){
            ans.add(banned[i]);
        }

        int count = 0;
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(ans.contains(i)){
                continue;
            }
            if(sum + i > maxSum){
                break;
            }
            sum = sum + i;
            count++;
        }
        return count;
    }
}