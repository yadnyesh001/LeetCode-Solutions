class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = check(n);
        }
        if(n == 1){
            return true;
        }
        return false;
    }

    public int check(int n){
        int sum = 0;
        while(n > 0){
            int ans = n % 10;
            sum = sum + ans*ans;
            n = n/10;
        }
        return sum;
    }
}