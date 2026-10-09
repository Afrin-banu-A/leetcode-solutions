
class Solution {
    public int countSubstrings(String s) {
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            int left = isPalin(s, i, i);
            int right = isPalin(s, i, i + 1);

            c += left;
            c += right;
        }

        return c;
    }

    public int isPalin(String s, int l, int r) {
        int count = 0;

        while (l >= 0 && r < s.length()
                && s.charAt(l) == s.charAt(r)) {
            count++;
            l--;
            r++;
        }

        return count;
    }
}
