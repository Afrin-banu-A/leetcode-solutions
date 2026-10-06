class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] spl=s.split("\\s+");
        String sb="";
        for(int i=spl.length-1;i>=0;i--){
            sb+=spl[i];
            if(i!=0){
                sb+=" ";
            }
        }
        return sb;
    }
}