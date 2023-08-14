class Solution {
    public void reverseString(char[] s) {
        recursiveReverce(s,0,s.length-1);
    }

    public static void iterativeReverce(char[]s){
        int start=0;
        int end=s.length-1;
        while(start<end)
        {
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }

    public static void recursiveReverce(char[]s,int first, int second){
        if(first>second) return;
        
        char temp = s[first];
        s[first] = s[second];
        s[second] = temp;
        recursiveReverce(s,first+1,second-1);
    }
}