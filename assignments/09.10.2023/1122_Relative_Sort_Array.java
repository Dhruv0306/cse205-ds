class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];
        for(int i: arr1){freq[i]++;}
        int[] ans = new int[arr1.length];
        int j = 0;
        for(int i : arr2){
            while(freq[i] > 0){
                ans[j++] = i;
                freq[i]--;
            }
        }
        for(int i = 0; i < 1001; i++){
            while(freq[i] > 0){
                ans[j++] = i;
                freq[i]--;
            }
        }
        return ans;
    }
}