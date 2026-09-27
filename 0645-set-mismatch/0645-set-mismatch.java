class Solution {
    public int[] findErrorNums(int[] nums) {

        HashMap<Integer, Integer> s = new HashMap<>();
        for (int n : nums) {
            if (s.containsKey(n)) {
                s.put(n, s.get(n) + 1);
            } else {
                s.put(n, 1);
            }
        }

        int d = 0;
        int m = 0;
        for (int i = 1; i <= nums.length; i++) {

            if (s.containsKey(i)) {

                if (s.get(i) == 2) {
                    d = i;
                }

            } else {
                m = i;
            }
        }

        return new int[]{d, m};
    }
}
   