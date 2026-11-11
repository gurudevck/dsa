//leetcode #567
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        for(char ch : s1.toCharArray()) s1Count[ch - 'a']++;
        int windowSize = s1.length();

        for(int right=0; right<s2.length(); right++){
            windowCount[s2.charAt(right) - 'a']++;

            if(right>=windowSize) windowCount[s2.charAt(right-windowSize) - 'a']--;

            if(Arrays.equals(s1Count, windowCount)) return true;
        }
        return false;
    }
}