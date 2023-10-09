class Solution {
    public String customSortString(String order, String s) {
        int[] freq = new int[256];
        for(char c: s.toCharArray()){
            freq[c]++;
        }
        StringBuilder sb = new StringBuilder();
        for(char c: order.toCharArray()){
            while(freq[c]>0){
                sb.append(c);
                freq[c]--;
            }
        }
        for(int i = 0; i < 256; i++){
            while(freq[i] > 0){
                sb.append((char)i);
                freq[i]--;
            }
        }
        return sb.toString();
    }
}