class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == null)map.put(nums[i],new ArrayList<Integer>());
            map.get(nums[i]).add(i);
        }
        for(ArrayList<Integer> list : map.values()){
            for(int i = 0; i < list.size(); i++){
                for(int j = i+1; j < list.size(); j++){
                    if(Math.abs(list.get(i)-list.get(j)) <= k)return true;
                }
            }
        }
        return false;
    }
}