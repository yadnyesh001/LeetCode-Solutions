class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int lastDay = days[days.length - 1];
        boolean[] travelDays = new boolean[366]; 
        for (int day : days) {
            travelDays[day] = true;
        }
        int[] dp = new int[366]; 
        for (int i = 1; i <= lastDay; i++) {
            if (!travelDays[i]) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = Math.min(
                    dp[i - 1] + costs[0],
                    Math.min(
                        dp[Math.max(0, i - 7)] + costs[1], 
                        dp[Math.max(0, i - 30)] + costs[2] 
                    )
                );
            }
        }
        return dp[lastDay];
    }
}
