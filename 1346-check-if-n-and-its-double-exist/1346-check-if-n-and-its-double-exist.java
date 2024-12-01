class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Float> ans = new HashSet<>();
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                count++;
            }
            else{
                ans.add((float)arr[i]);
            }
        }
        if(count > 1){
            return true;
        }
        for(int i=0; i<arr.length; i++){
            if(ans.contains((float)arr[i]*2) || ans.contains(arr[i]/2)){
                return true;
            }
        }
        return false;
    }
}