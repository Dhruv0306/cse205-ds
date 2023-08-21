class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] list = new int[k];
        List<List<Integer>> finalList = new ArrayList<>();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){arr[i] = i+1;}

        combinations(arr, list, finalList, 0, n-1, 0, k);

        return finalList;
    }

    public static void combinations(int[] nums,int[] l, List<List<Integer>> ll,int start, int end, int index, int eleCount){
        if( index == eleCount){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j : l) list.add(j);
            ll.add(list);
            return;
        }

        for (int i=start; i<=end && end-i+1 >= eleCount-index; i++)
        {
            l[index] = nums[i];
            combinations(nums, l, ll, i+1, end, index+1, eleCount);
        }
    }
}