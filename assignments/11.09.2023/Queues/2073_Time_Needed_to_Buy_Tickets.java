class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        // int seconds = 0;
        // for(int i = 0; i < tickets.length; i++){
        //     if(tickets[i] < tickets[k]) seconds += tickets[i]; 
        //     else{
        //         if(i <= k) seconds += tickets[k]; 
        //         else seconds += tickets[k] - 1; 
        //     }
        // }
        // return seconds;

        Queue<Integer> q = new LinkedList<>();

        for ( int i = 0; i < tickets.length; i++){
           q.add(i);
        }
        int count = 0;
        while(!q.isEmpty()){
            ++count;
            int front = q.poll();
            if(tickets[front] >= 1){
                tickets[front] -= 1;
            }
            if(k == front && tickets[front] == 0){
                break;
            }
            if(k != front && tickets[front] == 0){
                continue;
            }
            q.add(front);
        }
        return count;
    }
}