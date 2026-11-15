//leetcode #6
class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows>=s.length()) return s;

        StringBuilder result = new StringBuilder();
        int cycle = 2 * numRows - 2;

        for(int r=0; r<numRows; r++){
            for(int j=r; j<s.length(); j+=cycle){
                result.append(s.charAt(j));

                int diagonal = j + cycle - 2 * r;
                if(r!=0 && r!=numRows-1 && diagonal<s.length()) result.append(s.charAt(diagonal));
            }
        }
        return result.toString();
    }
}