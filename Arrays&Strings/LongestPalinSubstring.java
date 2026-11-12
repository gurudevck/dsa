//leetcode #5
class Solution {
    public String longestPalindrome(String s) {
        int bestStart = 0;
        int bestLength = 1;

        for(int center = 0; center<s.length(); center++){
            int oddLength = expand(s, center, center);
            int evenLength = expand(s, center, center+1);
            int length = Math.max(oddLength, evenLength);

            if(length > bestLength){
                bestLength = length;
                bestStart = center - (length - 1) / 2;
            }
        }
        return s.substring(bestStart, bestStart + bestLength);
    }

    private int expand(String s, int left, int right){
        while (left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}