class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        subSquence(nums,list,set,0);

        List<List<Integer>> finalList = new ArrayList<>(set);        
        return finalList;
    }

    private static void subSquence(int[] nums, List<Integer> list, HashSet<List<Integer>> ll, int n) {
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