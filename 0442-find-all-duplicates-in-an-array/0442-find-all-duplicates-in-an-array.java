class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> d=new HashSet<>();
        List<Integer> al=new ArrayList<>();
        for(int x:nums){
            if(d.contains(x)){
                al.add(x);
            }
            d.add(x);
        }
        return al;
        
    }
}