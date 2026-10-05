import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> m = new HashMap<>();

        for (String s : strs) {

            char[] a = s.toCharArray();
            Arrays.sort(a);

            String k = new String(a);

            if (!m.containsKey(k)) {
                m.put(k, new ArrayList<>());
            }

            m.get(k).add(s);
        }

        return new ArrayList<>(m.values());
    }
}