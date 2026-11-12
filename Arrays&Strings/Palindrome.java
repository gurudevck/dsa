//leetcode #125
class Solution {
    public boolean isPalindrome(String s) {
        char[] string = new char[s.length()];
        int length=0;
        for(int i=0; i<s.length(); i++){
            if (Character.isLetterOrDigit(s.charAt(i))) {
                string[length] = Character.toLowerCase(s.charAt(i));
                length++;
            }
        }
        for (int i =0; i<length; i++){
            if (string[i] == string[length-1-i]) continue;
            return false;
        }
        return true;
    }
}