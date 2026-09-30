class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();

        m.put(0, 1);

        int odd = 0;
        int count = 0;

        for (int n : nums) {

            if (n % 2 != 0) {
                odd++;
            }

            int req = odd - k;

            if (m.containsKey(req)) {
                count += m.get(req);
            }

            m.put(odd, m.getOrDefault(odd, 0) + 1);
        }
        return count;
    }
}