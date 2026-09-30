class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int sum=0;
        int c=0;
        m.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int req=sum-goal;
            if(m.containsKey(req)){
                c+=m.get(req);
            }
            m.put(sum,m.getOrDefault(sum,0)+1);
        }
        return c;

    }
    
}