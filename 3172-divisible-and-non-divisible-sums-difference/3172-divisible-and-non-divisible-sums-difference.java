class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1=0,sum2=0;
        HashSet<Integer> nums=new HashSet<>();
        for(int i=1;i<=n;i++){
            nums.add(i);
        }
        
        for(int a:nums){
            if(a%m==0){
                sum1+=a;
            }
            else{
                sum2+=a;
            }

        }

        return sum2-sum1;
    }
}