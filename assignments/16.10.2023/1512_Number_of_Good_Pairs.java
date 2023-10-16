class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int count = 0;
        for(int i = 0; i< nums.length; i++) {
            int elementCount = countMap.getOrDefault(nums[i], 0);
            count = count + elementCount;
            countMap.put(nums[i], elementCount + 1);
        }
        return count;
    }
}