class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        
        for (int n : nums1) {

            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        
        for (int n : nums2) {

            if (map.containsKey(n) && map.get(n) > 0) {

                result.add(n);

                map.put(n, map.get(n) - 1);
            }
        }

         
        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}