class Solution {
    public int maximum69Number (int num) {
        List<Integer> list = new ArrayList<>();
        while(num > 0){
            list.add(num % 10);
            num = num/10;
        }
        int index = 0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == 6){
                index = i;
            }
        }
        for(int i=0; i<list.size(); i++){
            if(index == i){
                num = num + 9*(int)(Math.pow(10,i));
            }
            else{
                num = num + list.get(i)*(int)(Math.pow(10,i));
            }
        }
        return num;
    }
}