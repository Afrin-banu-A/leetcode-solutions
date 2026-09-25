class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Boolean> h=new HashMap<>();
        for(int num:nums){
            h.put(num,true);
        }
        for(int i=0;i<=nums.length;i++){
            if(!h.containsKey(i)){
                return i;
            }
        }
        return -1;
    }
}