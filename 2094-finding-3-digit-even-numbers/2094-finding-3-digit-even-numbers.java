class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] arr = new int[10];
        for (int digit : digits) {
            arr[digit]++;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 100; i <= 998; i += 2) {
            int a = i;
            int x = i % 10;       
            int y = (i / 10) % 10;
            int z = i / 100;        
            int[] pqr = arr.clone();  
            int count = 0;
            if (pqr[x]-- > 0){
                count++;
            }
            else{
                continue;
            }
            if (pqr[y]-- > 0){
                count++;
            }
            else{
                continue;
            }
            if (pqr[z]-- > 0){
                count++;
            }
            else{
                continue;
            }
            if (count == 3) {
                list.add(a);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
