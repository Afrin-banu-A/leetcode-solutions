class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        int r=s.length()-1;
        while(r>=0){
            while(r>=0 && s.charAt(r)==' '){
                r--;
            }
            if(r<0){
                break;
            }
            int l=r;
            while(l>=0 && s.charAt(l)!=' '){
                l--;
            }
            if(sb.length()>0){
                sb.append(" ");
            }
            sb.append(s.substring(l+1,r+1));
            r=l-1;
        }
        return sb.toString();
    }
}