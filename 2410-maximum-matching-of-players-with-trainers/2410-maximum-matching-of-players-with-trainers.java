class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int x = 0;
        for(int i=0; i<trainers.length && x<players.length; i++){
            if(players[x] <= trainers[i]){
                x++;
            }
        }
        return x;
    }
}