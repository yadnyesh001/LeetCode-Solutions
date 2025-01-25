class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        Integer[][] pairs = new Integer[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;       
        }
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        
        int[] result = new int[n];
        
        List<List<Integer>> groups = new ArrayList<>();
        List<Integer> currentGroup = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (currentGroup.isEmpty() || 
                pairs[i][0] - pairs[currentGroup.get(currentGroup.size() - 1)][0] <= limit) {
                currentGroup.add(i);
            } else {
                groups.add(currentGroup);
                currentGroup = new ArrayList<>();
                currentGroup.add(i);
            }
        }
        if (!currentGroup.isEmpty()) {
            groups.add(currentGroup);
        }
        
        for (List<Integer> group : groups) {
            List<Integer> indices = group.stream()
                .map(i -> pairs[i][1])
                .sorted()
                .collect(Collectors.toList());
            
            for (int j = 0; j < group.size(); j++) {
                result[indices.get(j)] = pairs[group.get(j)][0];
            }
        }
        
        return result;
    }
}