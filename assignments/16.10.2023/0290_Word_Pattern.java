class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");
        if (pattern.length() != split.length) {
            return false;
        }
        char[] p = pattern.toCharArray();
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reverse = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            if (map.containsKey(p[i])) {
                if (!(map.get(p[i]).equals(split[i]))) {
                    return false;
                }
            }
            else if (reverse.containsKey(split[i])) {
                return false;
            }
            map.put(p[i], split[i]);
            reverse.put(split[i], p[i]);
        }
        return true;
    }
}