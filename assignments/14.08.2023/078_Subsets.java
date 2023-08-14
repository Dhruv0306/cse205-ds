class Solution {
    public static List<List<Integer>> subsets(int[] nums) {
        System.gc();
        System.out.flush();
        List<Integer> list  = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        subSquence(nums,list,finalList,0);
        return finalList;
    }

    private static void subSquence(int[] nums, List<Integer> list, List<List<Integer>> ll, int n) {
        if(nums.length==n){
            ll.add(new ArrayList<>(list));
            return ;
        }
        list.add(nums[n]);
        subSquence(nums, list, ll, n+1);
        list.remove(list.size()-1);
        subSquence(nums, list, ll, n+1);
    }
}