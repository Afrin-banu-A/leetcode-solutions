class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s= new HashSet<>();
        for(int n:nums){
            if(s.contains(n))
                return true;
            
            s.add(n);
        }
        return false;
}
}