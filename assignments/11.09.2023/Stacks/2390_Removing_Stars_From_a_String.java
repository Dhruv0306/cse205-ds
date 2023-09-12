class Solution {
    public String removeStars(String s) {
        // Stack<Character> S = new Stack<>();
        // for(char c : s.toCharArray()){
        //     if(c != '*')S.push(c);
        //     else{
        //         if(!S.empty()){
        //             S.pop();
        //         }
        //     }
        // }
        // StringBuilder ss = new StringBuilder();
        // while(!S.empty()){
        //     ss.append(S.pop());
        // }
        // ss.reverse();
        // return ss.toString();
        int len = s.length();
        byte[] result = new byte[len];
        s.getBytes(0, len, result, 0);
        int stars = 0;
        for (int i = 0; i < len; i++) {
            if (result[i] == '*') {
                stars++;
            } else {
                result[i - stars * 2] = result[i];
            }
        }
        return new String(result, 0, len - stars * 2);
    }
}