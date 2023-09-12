class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // int[] ind = new int[10000];
        // int[] max = new int[nums2.length];
        // int pointer = 0;
        
        // for (int i = 0; i < nums1.length; i++) {
        //     ind[nums1[i]] = i + 1;
        // }
        // int[] res = new int[nums1.length];
        // for (int i = nums2.length - 1; i >= 0; i--) {
        //     int num = nums2[i];
        //     while (pointer > 0 && max[pointer - 1] < num) {
        //         pointer--;
        //     }
        //     if (ind[num] > 0) {
        //         res[ind[num] - 1] = pointer == 0 ? -1 : max[pointer - 1];
        //     }
        //     max[pointer++] = num;
        // }
        // return res;

        int[] result = new int[nums1.length];
        Stack<Integer> stack=new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int num: nums2){            
            while(!stack.isEmpty() && num > stack.peek())
                map.put(stack.pop(), num);
            stack.push(num);            
        }
        System.gc();
        int i=0;        
        for(int num : nums1)
            result[i++] = map.getOrDefault(num, -1);
        return result;
    }
}