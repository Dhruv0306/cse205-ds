class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums){
            pq.offer(i-1);
        }
        return pq.poll()*pq.poll();
    }
}