class Solution {
    public int[] closestPrimes(int left, int right) {
        int arr[] = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        List<Integer> list = new ArrayList<>();
        for(int i=left; i<= right; i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        int n = list.size();
        if(n < 2){
            return arr;
        }
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i=0; i<n-1; i++){
            if(min > list.get(i+1) - list.get(i)){
                min = list.get(i+1) - list.get(i);
                index = i;
            }
        }
        arr[0] = list.get(index);
        arr[1] = list.get(index+1);
        return arr;
    }

    public boolean isPrime(int n){
        if (n <= 1) return false; 
        int x = (int) Math.sqrt(n);
        for(int i=2; i<=x; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}