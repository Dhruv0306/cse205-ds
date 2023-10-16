class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;
        int[] count = new int[n + 1];
        for (int i = 0; i < n; i++) {
            count[nums[i]]++; // Increment count at the index corresponding to the current number
            if (count[nums[i]] == 2) {
                result[0] = nums[i]; // Found the duplicate number
            }
        }
        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                result[1] = i; // Found the missing number
                break;
            }
        }
        return result;
    }
}