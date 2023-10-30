class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones){
            pq.offer(i);
        }
        while(pq.size() > 1){
            int y = pq.poll();
            int x = pq.poll();

            if(y != x){
                pq.offer(y-x);
            }
            if(pq.size() == 0)return 0;
        }
        return pq.poll();
    }
}