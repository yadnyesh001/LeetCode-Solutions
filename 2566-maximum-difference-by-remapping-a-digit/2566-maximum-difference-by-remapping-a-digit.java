class Solution {
    public int minMaxDifference(int num) {
        int max = 0;
        int min = 0;
        int x = num;
        while(num != 0){
            if(num % 10 != 9){
                max = num % 10;
            }
            if(num % 10 != 0){
                min = num % 10;
            }
            num = num/10;
        }
        num = x;
        int newmin = 0;
        int newmax = 0;
        int i = 0;
        System.out.println(max);
        System.out.println(min);
        while(num != 0){
            int p = num % 10;
            if(p == max){
                newmax = newmax + (int)Math.pow(10, i)*9;
            }
            else{
                newmax = newmax + (int)Math.pow(10, i)*p;
            }
            if(p == min){
                newmin = newmin + (int)Math.pow(10, i)*0;
            }
            else{
                newmin = newmin + (int)Math.pow(10, i)*p;
            }
            i++;
            num = num/10;
        }
        System.out.println(newmax);
        System.out.println(newmin);
        return newmax - newmin;
    }
}