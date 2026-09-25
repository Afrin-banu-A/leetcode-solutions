class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int x:nums){
            if(h.contains(x)){
                return x;
            }
            h.add(x);
        }
        return 0;
    }
}