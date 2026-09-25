class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Boolean> h=new HashMap<>();
        for(int n:nums){
            h.put(n,true);
        }
        for(int i=1;i<=nums.length;i++){
            if(!h.containsKey(i)){
                l.add(i);
            }
        }
        return l;

        
    }
}