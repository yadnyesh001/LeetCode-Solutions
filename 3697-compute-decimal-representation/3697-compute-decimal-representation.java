class Solution {
    public int[] decimalRepresentation(int n) {
        int x = n;
        int l = 0;
        while(x > 0){
            int p = x%10;
            if(p>0){
                l++;
            }
            x = x/10;
        }
        int arr[] = new int[l];
        int a = 0;
        int b = 0;
        while(n>0){
            int p = n%10;
            if(p > 0){
                arr[a++] = (p)*(int)Math.pow(10,b);
            }
            n = n/10;
            b++;
        }
        for(int i=0; i<arr.length/2; i++){
            int y = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = y;
        }
        return arr;
    }
}