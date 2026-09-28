class Solution {
    public int numOfSubarrays(int[] arr) {

        long count = 0;
        long odd = 0;
        long even = 1;

        int sum = 0;
        int mod = 1000000007;

        for (int n : arr) {

            sum += n;

            if (sum % 2 == 0) {
                count += odd;
                even++;
            } else {
                count += even;
                odd++;
            }

            count %= mod;
        }

        return (int) count;
    }
}