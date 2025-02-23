class Solution {
    public long maxWeight(int[] pizzas) {
        Arrays.sort(pizzas);
        long ans = 0;
        int n = pizzas.length, last = n-1;
        int odd = n/8, even = n/8;
        if(n%8 != 0) odd++;
        while(odd --> 0) {
            ans += pizzas[last--];
        }
        while(even --> 0) {
            ans += pizzas[last-1];
            last -= 2;
        }
        return ans;
    }
}