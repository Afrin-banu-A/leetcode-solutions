class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s=new HashSet<>();
        for(int n:nums1){
            s.add(n);
        }
        HashSet<Integer> h=new HashSet<>();
        for(int n:nums2){
            if(s.contains(n)){
                h.add(n);
            }
        }
        int a[]=new int [h.size()];
        int i=0;
        for(int n:h){
            a[i]=n;
            i++;

        }
        return a;
    }
}