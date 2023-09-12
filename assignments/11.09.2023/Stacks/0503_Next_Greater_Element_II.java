class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for(int i = n * 2 - 1; i >= 0; i--) {
            while(!st.isEmpty() && st.peek() <= nums[i % n]) {
                st.pop();
            }
            if(i < n) {
                ans[i] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(nums[i % n]);
        }
        return ans;

        // int size = nums.length;
        // int[] stack = new int[size];
        // int[] result = new int[size];
        // int index = 0;
        // Arrays.fill(result, -1);

        // for (int i = 0; i < 2 * nums.length; ++i) {
        //     int val = nums[i % size];

        //     while (index > 0 && nums[stack[index - 1]] < val) {
        //         result[stack[--index]] = val;
        //     }

        //     if (i < size) {
        //         stack[index++] = i;
        //     }
        // }
        
        // return result;
    }
}