import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> m = new HashMap<>();

        for (char c : s.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) - 1);
        }

        for (int co : m.values()) {
            if (co != 0) {
                return false;
            }
        }

        return true;
    }
}