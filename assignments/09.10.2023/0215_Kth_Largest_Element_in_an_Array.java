class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] val = new int[20001];
        for(int num : nums) {
            val[num+10000]++;
        }
        for(int i=20000; i>=0; i--) {
            k-=val[i];
            if(k<=0) return i-10000;
        }
        return -1;
    }
}