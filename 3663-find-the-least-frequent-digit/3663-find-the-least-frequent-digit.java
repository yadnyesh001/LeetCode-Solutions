class Solution {
    public int getLeastFrequentDigit(int n) {
        int arr[] = new int[10];
        while(n > 0){
            int x = n % 10;
            arr[x]++;
            n = n/10;
        }
        for(int i=0; i<10; i++){
            System.out.println(arr[i]);
        }
        int index = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<10; i++){
            if(min > arr[i] && arr[i] != 0){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}