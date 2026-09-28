class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int sum=0;
        int c=0;
        h.put(0,1);
        for(int n:nums){
            sum+=n;
            int req=sum-k;
            if(h.containsKey(req)){
                c+=h.get(req);
            }
            h.put(sum,h.getOrDefault(sum,0)+1);
        }
        return c;
    }
}