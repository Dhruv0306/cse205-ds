class Solution {
    public boolean backspaceCompare(String s, String t) {
        // Stack<Character> sS = new Stack<>();
        // Stack<Character> tS = new Stack<>();
        // int i = 0;
        // while(i<s.length()){
        //     if(s.charAt(i) == '#'){
        //         if(!sS.empty())sS.pop();
        //     }
        //     else sS.push(s.charAt(i));
        //     i++;
        // }
        // i = 0;
        // while(i<t.length()){
        //     if(t.charAt(i) == '#'){
        //         if(!tS.empty())tS.pop();
        //     }
        //     else tS.push(t.charAt(i));
        //     i++;
        // }
        // while(!sS.empty() && !tS.empty()){
        //     if((sS.pop()-'a') != (tS.pop()-'a'))return false;
        // }
        // System.gc();
        // return (sS.empty() && tS.empty());
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        int ssptr = 0, sfptr = 0;
        for (; sfptr != sarr.length; ++sfptr) {
            if (sarr[sfptr] != '#') {
                sarr[ssptr] = sarr[sfptr];
                ssptr += 1;
            } else {
                if (ssptr >= 1) { ssptr -= 1; }
            }
        }
        int tsptr = 0, tfptr = 0;
        for (; tfptr != tarr.length; ++tfptr) {
            if (tarr[tfptr] != '#') {
                tarr[tsptr] = tarr[tfptr];
                tsptr += 1;
            } else {
                if (tsptr >= 1) { tsptr -= 1; }
            }
        }

        if (ssptr != tsptr) { return false; }
        for (int ix = 0; ix != ssptr; ++ix) {
            if (sarr[ix] != tarr[ix]) {
                return false;
            }
        }
        return true;
    }
}