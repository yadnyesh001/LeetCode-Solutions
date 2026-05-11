class Solution {
    public int[] scoreValidator(String[] events) {
        int arr[] = new int[2];
        for(int i=0; i<events.length; i++){
            if(events[i].equals("WD")){
                arr[0]++;
            }
            else if(events[i].equals("NB")){
                arr[0]++;
            }
            else if(events[i].equals("W")){
                arr[1]++;
            }
            else{
                int x = Integer.parseInt(events[i]);
                arr[0] += x;
            }
            
            if(arr[1] == 10){
                break;
            }
        }
        return arr;
    }
}