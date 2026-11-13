
class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] arr = new StringBuilder[numRows];

        for(int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
        }

        int row = 0;
        int down = 1;

        for(int i = 0; i < s.length(); i++) {
            arr[row].append(s.charAt(i));

            if(row == 0) {
                down = 1;
            }
            else if(row == numRows - 1) {
                down = -1;
            }

            row = row + down;
        }

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < numRows; i++) {
            ans.append(arr[i]);
        }

        return ans.toString();
    }
}
