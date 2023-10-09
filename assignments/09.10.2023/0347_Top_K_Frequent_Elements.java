class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //  Find min and max number
        for(int num:nums){
            if(num > max) max = num;
            if(num < min) min = num;
        }
        //  Build frequence array
        int[] freq = new int[max - min + 1];
        for(int num:nums){
            freq[num - min] ++;
        }
        //  Put numbers with same frequence into a bucket
        List<Integer>[] bucket = new List[nums.length + 1];
        int max_freq = 0;
        for(int i=0; i<freq.length; i++){
            if(freq[i] > 0){
                if(bucket[freq[i]] == null) bucket[freq[i]] = new ArrayList<>();
                bucket[freq[i]].add(i + min);
                if(freq[i] > max_freq) max_freq = freq[i];
                // max_freq = Math.max(max_freq, freq[i]);
            }
        }
        //Loop through buckets to find top k frequent element
        int[] res = new int[k];
        int i = 0;
        for(int j=max_freq; j>=0 && i<k; j--){
            if(bucket[j] != null){
                for(int num : bucket[j]) {
                    if(i == k) break;
                    res[i++] = num;
                }
            }
        }
        return res;
    }
}