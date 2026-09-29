class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> m= new HashMap<>();
        int sum=0;
        int max1=0;
        m.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum--;
            }
            else{
                sum++;
            }
            if(m.containsKey(sum)){
                int len=i-m.get(sum);
                max1=Math.max(len,max1);
            }
            else{
                m.put(sum,i);
            }
        }
        return max1;
    }
}