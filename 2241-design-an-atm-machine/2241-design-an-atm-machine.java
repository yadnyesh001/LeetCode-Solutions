class ATM {
    long notes[] = {20, 50, 100, 200, 500};
    long store[];
    public ATM() {
        store = new long[5];
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i=0; i<5; i++){
            store[i] += banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int arr[] = new int[5];
        int i = 4;
        long currStore[] = store.clone();
        while(i >= 0){
            long x = Math.min(currStore[i], amount / notes[i]);
            if(x > 0){
                amount -= notes[i]*x;
                currStore[i] -= x;
            }
            arr[i--] = (int)x;
        }
        if(amount != 0){
            return new int[]{-1};
        }
        store = currStore;
        return arr;
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */