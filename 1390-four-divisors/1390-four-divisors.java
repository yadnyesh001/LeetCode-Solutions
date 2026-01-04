class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + hasFour(nums[i]);
        }
        return sum;
    }

    public int hasFour(int x){
        int sum = 0;
        int count = 0;
        int root = (int)Math.sqrt(x);
        if(root * root == x){
            return 0;
        }
        for(int i=1; i<=root; i++){
            if(x % i == 0){
                count = count + 2;
                sum = sum + i + (int)(x/i);
            }
        }
        if(count == 4){
            return sum;
        }
        return 0;
    }
}