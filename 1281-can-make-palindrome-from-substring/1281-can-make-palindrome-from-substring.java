import java.util.*;

class Solution {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {

        List<Boolean> ans = new ArrayList<>();

        int n = s.length();

        // prefix[i][j] = frequency of character j
        // in the first i characters
        int[][] prefix = new int[n + 1][26];

        for (int i = 0; i < n; i++) {

            // Copy previous frequencies
            for (int j = 0; j < 26; j++) {
                prefix[i + 1][j] = prefix[i][j];
            }

            // Add current character
            prefix[i + 1][s.charAt(i) - 'a']++;
        }

        for (int[] q : queries) {

            int left = q[0];
            int right = q[1];
            int k = q[2];

            int odd = 0;

            for (int j = 0; j < 26; j++) {

                int count = prefix[right + 1][j] - prefix[left][j];

                if (count % 2 == 1) {
                    odd++;
                }
            }

            if (odd / 2 <= k) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        return ans;
    }
}