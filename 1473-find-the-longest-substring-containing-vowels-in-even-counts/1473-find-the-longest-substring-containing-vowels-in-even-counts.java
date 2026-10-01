class Solution {
    public int findTheLongestSubstring(String s) {

        int[] first = new int[32];

        for (int i = 0; i < 32; i++) {
            first[i] = -2;
        }

        first[0] = -1;

        int mask = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a') {
                mask ^= 1;
            }
            else if (ch == 'e') {
                mask ^= 2;
            }
            else if (ch == 'i') {
                mask ^= 4;
            }
            else if (ch == 'o') {
                mask ^= 8;
            }
            else if (ch == 'u') {
                mask ^= 16;
            }

            if (first[mask] == -2) {
                first[mask] = i;
            }
            else {
                max = Math.max(max, i - first[mask]);
            }
        }

        return max;
    }
}